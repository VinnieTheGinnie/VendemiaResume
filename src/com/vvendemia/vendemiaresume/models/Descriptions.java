package com.vvendemia.vendemiaresume.models;

import com.google.gson.annotations.SerializedName;

public class Descriptions {

	@SerializedName("descriptionText")
	private String descriptionText;

	public Descriptions(String description) {
		super();
		this.descriptionText = description;
	}

	public String getDescription() {
		return descriptionText;
	}

	public void setDescription(String description) {
		this.descriptionText = description;
	}
	
	
	
}
