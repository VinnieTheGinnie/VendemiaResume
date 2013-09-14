package com.vvendemia.vendemiaresume.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Education {
	
	@SerializedName("School")
	private String School;
	
	@SerializedName("GraduationInfo")
	private String gradInfo;
	
	@SerializedName("Majors")
	private List<Majors> majors;

	public Education(String school, String gradInfo, List<Majors> majors) {
		super();
		this.School = school;
		this.gradInfo = gradInfo;
		this.majors = majors;
	}

	public String getSchool() {
		return School;
	}

	public void setSchool(String school) {
		this.School = school;
	}

	public String getGradInfo() {
		return gradInfo;
	}

	public void setGradInfo(String gradInfo) {
		this.gradInfo = gradInfo;
	}

	public List<Majors> getMajors() {
		return majors;
	}

	public void setMajors(List<Majors> majors) {
		this.majors = majors;
	}

}
