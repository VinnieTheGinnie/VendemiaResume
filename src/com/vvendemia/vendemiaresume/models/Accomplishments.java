package com.vvendemia.vendemiaresume.models;

import com.google.gson.annotations.SerializedName;

public class Accomplishments {
	
	@SerializedName("Title")
	private String Title;
	
	@SerializedName("TimeFrame")
	private String TimeFrame;
	
	@SerializedName("Description")
	private String Description;

	public Accomplishments(String title, String timeFrame, String description) {
		super();
		this.Title = title;
		this.TimeFrame = timeFrame;
		this.Description = description;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public String getTimeFrame() {
		return TimeFrame;
	}

	public void setTimeFrame(String timeFrame) {
		this.TimeFrame = timeFrame;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}
	
	
	
	
	
}
