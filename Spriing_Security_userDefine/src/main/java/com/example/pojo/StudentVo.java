package com.example.pojo;

import org.springframework.stereotype.Component;

@Component
public class StudentVo {
	private int id;
	private String name;
	private String city;
	private String mobileNuber;
	private String department;
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
	public String getMobileNuber() {
		return mobileNuber;
	}
	public void setMobileNuber(String mobileNuber) {
		this.mobileNuber = mobileNuber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
