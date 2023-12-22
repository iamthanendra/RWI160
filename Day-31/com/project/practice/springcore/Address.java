package com.project.practice.springcore;

public class Address {
	private String streetName;
	private String cityName;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String streetName, String cityName) {
		super();
		this.streetName = streetName;
		this.cityName = cityName;
	}
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", cityName=" + cityName + "]";
	}
}
