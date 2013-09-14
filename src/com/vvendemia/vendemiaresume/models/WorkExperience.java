package com.vvendemia.vendemiaresume.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class WorkExperience {

	@SerializedName("JobTitle")
	private String jobTitle;
	
	@SerializedName("TimeFrame")
	private String timeFrame;
	
	@SerializedName("Descriptions")
	List<Descriptions> descriptions;

	public WorkExperience(String jobTitle, String timeFrame,
			List<Descriptions> descriptions) {
		super();
		this.jobTitle = jobTitle;
		this.timeFrame = timeFrame;
		this.descriptions = descriptions;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getTimeFrame() {
		return timeFrame;
	}

	public void setTimeFrame(String timeFrame) {
		this.timeFrame = timeFrame;
	}

	public List<Descriptions> getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(List<Descriptions> descriptions) {
		this.descriptions = descriptions;
	}

}
