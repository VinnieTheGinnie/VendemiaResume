package com.vvendemia.vendemiaresume;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.InjectView;
import butterknife.Views;

import com.google.gson.Gson;
import com.vvendemia.vendemiaresume.models.Accomplishments;
import com.vvendemia.vendemiaresume.models.Descriptions;
import com.vvendemia.vendemiaresume.models.Education;
import com.vvendemia.vendemiaresume.models.Majors;
import com.vvendemia.vendemiaresume.models.PersonalInfo;
import com.vvendemia.vendemiaresume.models.ResumeResponse;
import com.vvendemia.vendemiaresume.models.SkillsAbilities;
import com.vvendemia.vendemiaresume.models.WorkExperience;

public class MainActivity extends Activity {

	public static String TAG = "MainActivity";

	LayoutInflater inflater;

	PersonalInfo personalInfo;
	Education education;
	List<WorkExperience> workExperience;
	List<Accomplishments> accomplishments;
	List<SkillsAbilities> skillsAbilities;

	@InjectView(R.id.myName) TextView myName;

	@InjectView(R.id.address) 
	TextView address;

	@InjectView(R.id.phone) 
	TextView phone;

	@InjectView(R.id.email) 
	TextView email;

	@InjectView(R.id.school) 
	TextView school;

	@InjectView(R.id.grad_info) 
	TextView graduationInfo;

	@InjectView(R.id.major_layout) 
	LinearLayout majorLayout;

	@InjectView(R.id.work_experience_layout)
	LinearLayout experienceLayout;

	@InjectView(R.id.accomplishments_layout)
	LinearLayout accomplishmentsLayout;

	@InjectView(R.id.skills_abilities_layout)
	LinearLayout skillsAbsLayout;

	Activity currActivity;
	private final String WEBSITE_URL = "https://www.mobileappdevelopersclub.com";
	private String MAGAZI = "http://magazi-ag.com/#!/";
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getActionBar().setTitle("Vinnie Vendemia's Resume");
		Views.inject(this);
		inflater = getLayoutInflater();
		currActivity = this;

		fetchResumeData();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void fetchResumeData() {
		Gson gson = new Gson();
		String json = null;
		try {
			json = parseAsString("resume_info.json");
		} catch (IOException e) {
			Toast.makeText(this, "Could not parse JSON to String", Toast.LENGTH_SHORT).show();
		}

		ResumeResponse response = gson.fromJson(json, ResumeResponse.class);

		personalInfo = response.getPersonalInfo();
		education = response.getEducation();
		workExperience = response.getWorkExperience();
		accomplishments = response.getAccomplishments();
		skillsAbilities = response.getSkillsAbilities();



		if(response != null) {
			setUpView();
		}
	}

	private void setUpView() {

		PersonalInfo info = personalInfo;
		//Personal Info
		myName.setText(personalInfo.getName());
		address.setText(personalInfo.getAddress());
		phone.setText(personalInfo.getPhone());
		email.setText(personalInfo.getEmial());

		//Education
		school.setText(education.getSchool());
		graduationInfo.setText(education.getGradInfo());
		setUpMajorsView();

		//Work Experience
		setUpExperienceView();

		//Set up accomplishmets 
		setUpAccomplishments();

		//Set up skills/ Abilities 
		setUpSkillsAbilities();


	}

	@SuppressLint("NewApi")
	private void setUpSkillsAbilities() {

		for(int i = 0 ; i <  skillsAbilities.size(); i++) {
			SkillsAbilities curr = skillsAbilities.get(i);
			LinearLayout skillsAbs = (LinearLayout) inflater.inflate(R.layout.major_description, null);
			((TextView)skillsAbs.findViewById(R.id.header)).setText(curr.getSkill());
			((TextView)skillsAbs.findViewById(R.id.description)).setText(curr.getLabel());
			if(TextUtils.isEmpty(curr.getLabel())) {
				((TextView)skillsAbs.findViewById(R.id.description)).setVisibility(View.INVISIBLE);
			}
			skillsAbsLayout.addView(skillsAbs);
		}
	}

	@SuppressLint("NewApi")
	private void setUpAccomplishments() {

		for(int i = 0 ; i <  accomplishments.size(); i++) {
			Accomplishments curr = accomplishments.get(i);
			LinearLayout accomps = (LinearLayout) inflater.inflate(R.layout.accomplishments, null);
			((TextView)accomps.findViewById(R.id.header)).setText(curr.getTitle());
			createCustomTitleListeners(curr.getTitle(), ((TextView)accomps.findViewById(R.id.header)) );
			((TextView)accomps.findViewById(R.id.timeFrame)).setText(curr.getTimeFrame());
			((TextView)accomps.findViewById(R.id.descriptions)).setText(curr.getDescription());
			accomplishmentsLayout.addView(accomps);
		}
	}

	private void createCustomTitleListeners(String title, TextView header) {
		//Special Feature, have package name for Moviebox
		if( title.equals("MovieBox")) {
			header.setOnTouchListener(new OnTouchListener(){

				@Override
				public boolean onTouch(View arg0, MotionEvent arg1) {
					Log.d(TAG, "Touched Moviebox");
					Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("com.aol.mobile.moviefonetogo");
					startActivity(LaunchIntent);
					return true;
				}});
		} else if (title.equals("Shellp")) {
			header.setOnTouchListener(new OnTouchListener(){

				@Override
				public boolean onTouch(View arg0, MotionEvent arg1) {
					Log.d(TAG, "Touched Shellp");
					Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("com.mobileappdevelopersclub.shellp");
					startActivity(LaunchIntent);
					return true;
				}});
		} else if(title.equals("Founder of Mobile App Developers Club (M.A.D)")) {
			header.setOnTouchListener(new OnTouchListener(){

				@Override
				public boolean onTouch(View arg0, MotionEvent arg1) {
					Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(WEBSITE_URL));
					startActivity(browserIntent);
					return true;
				}});
		} else if(title.equals("UMD Trivia")) {
			header.setOnTouchListener(new OnTouchListener(){

				@Override
				public boolean onTouch(View arg0, MotionEvent arg1) {
					Log.d(TAG, "Touched Shellp");
					Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("vinnie.vendemia.namespace");
					startActivity(LaunchIntent);
					return true;
				}});

		} else if(title.equals("Magazi-Ag.com")) {
			header.setOnTouchListener(new OnTouchListener(){

				@Override
				public boolean onTouch(View arg0, MotionEvent arg1) {
					Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(MAGAZI));
					startActivity(browserIntent);
					return true;
				}});
		}else {
			//Do Nothing
		}
	}


	@SuppressLint("NewApi")
	private void setUpExperienceView() {

		for(int i = 0 ; i < workExperience.size() ; i++) {
			WorkExperience job = workExperience.get(i);;
			LinearLayout workExperiences = (LinearLayout) inflater.inflate(R.layout.work_experience , null);
			((TextView)workExperiences.findViewById(R.id.job_title)).setText(job.getJobTitle());
			((TextView)workExperiences.findViewById(R.id.time_frame)).setText(job.getTimeFrame());
			LinearLayout jobDescriptions = ((LinearLayout)workExperiences.findViewById(R.id.descriptions));

			List<Descriptions> descriptions = job.getDescriptions();
			for(int j =0 ; j < descriptions.size(); j++) {
				TextView text = new TextView(this);
				text.setText(descriptions.get(j).getDescription());
				text.setPadding(0, 2, 0, 0);
				jobDescriptions.addView(text);
			}

			experienceLayout.addView(workExperiences);
		}

	}



	@SuppressLint("NewApi")
	private void setUpMajorsView() {
		List<Majors> myMajors = education.getMajors();

		for(int i = 0 ; i < myMajors.size(); i++) {
			Majors major = myMajors.get(i);
			if(major != null) {
				LinearLayout majors = (LinearLayout) inflater.inflate(R.layout.major_description, null);
				((TextView)majors.findViewById(R.id.header)).setText(major.getName());
				((TextView)majors.findViewById(R.id.description)).setText(major.getDescription());
				majorLayout.addView(majors);
			}
		}

	}

	public String parseAsString(String filename) throws IOException {

		AssetManager assetManager = this.getAssets();

		InputStream in = assetManager.open(filename);

		int size = in.available();
		byte[] buffer = new byte[size];

		in.read(buffer);
		in.close();

		String fileAsString = new String(buffer);

		return fileAsString;

	}

}
