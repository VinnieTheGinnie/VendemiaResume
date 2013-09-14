package com.vvendemia.vendemiaresume.models;

import com.google.gson.annotations.SerializedName;

public class SkillsAbilities {

	@SerializedName("skill")
	private String skill;
	

	@SerializedName("label")
	private String label;


	public SkillsAbilities(String skill, String label) {
		super();
		this.skill = skill;
		this.label = label;
	}


	public String getSkill() {
		return skill;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}

}
