package com.vvendemia.vendemiaresume.models;

import com.google.gson.annotations.SerializedName;

public class PersonalInfo {

	@SerializedName("Name")
	private String Name;
	
	@SerializedName("Address")
	private String address;
	
	@SerializedName("Email")
	private String email;
	
	@SerializedName("Phone")
	private String phone;

	public PersonalInfo(String name, String address, String emial, String phone) {
		super();
		this.Name = name;
		this.address = address;
		this.email = emial;
		this.phone = phone;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmial() {
		return email;
	}

	public void setEmial(String emial) {
		this.email = emial;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
