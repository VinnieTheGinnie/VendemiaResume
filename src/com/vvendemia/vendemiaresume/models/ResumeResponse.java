package com.vvendemia.vendemiaresume.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ResumeResponse {
	
	@SerializedName("PersonalInfo")
	private PersonalInfo personalInfo;
	
	@SerializedName("Education")
	private Education education;
	
	@SerializedName("WorkExperience")
	private List<WorkExperience> workExperience;
	
	@SerializedName("Accomplishments")
	private List<Accomplishments> accomplishments;
	
	@SerializedName("SkillsAbilities")
	private List<SkillsAbilities> skillsAbilities;

	public ResumeResponse(PersonalInfo personalInfo, Education education,
			List<WorkExperience> workExperience,
			List<Accomplishments> accomplishments,
			List<SkillsAbilities> skillsAbilities) {
		super();
		this.personalInfo = personalInfo;
		this.education = education;
		this.workExperience = workExperience;
		this.accomplishments = accomplishments;
		this.skillsAbilities = skillsAbilities;
	}

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public List<WorkExperience> getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(List<WorkExperience> workExperience) {
		this.workExperience = workExperience;
	}

	public List<Accomplishments> getAccomplishments() {
		return accomplishments;
	}

	public void setAccomplishments(List<Accomplishments> accomplishments) {
		this.accomplishments = accomplishments;
	}

	public List<SkillsAbilities> getSkillsAbilities() {
		return skillsAbilities;
	}

	public void setSkillsAbilities(List<SkillsAbilities> skillsAbilities) {
		this.skillsAbilities = skillsAbilities;
	}
	
}
