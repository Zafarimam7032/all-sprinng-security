package com.grwts.vo;

public class StudentVo {
	private int id;
	private String name;
	private String city;
	private String mobileNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "StudentVo [id=" + id + ", name=" + name + ", city=" + city + ", mobileNumber=" + mobileNumber + "]";
	}
	public StudentVo(int id, String name, String city, String mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobileNumber = mobileNumber;
	}
	public StudentVo() {
		super();
	}
	 

}
