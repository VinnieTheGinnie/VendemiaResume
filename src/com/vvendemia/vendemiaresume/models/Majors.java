package com.vvendemia.vendemiaresume.models;

import com.google.gson.annotations.SerializedName;

public class Majors {
	
	@SerializedName("majorName")
	private String majorName;
	
	@SerializedName("description")
	private String description;

	public Majors(String name, String description) {
		super();
		this.majorName = name;
		this.description = description;
	}

	public String getName() {
		return majorName;
	}

	public void setName(String name) {
		this.majorName = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
