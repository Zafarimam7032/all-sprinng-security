package com.example.Emp.pojo;

import org.springframework.stereotype.Component;

@Component
public class EmpVo {
	private int empId;
	private String name;
	private String city;
	private String deparmeant;
	private double salry;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public String getDeparmeant() {
		return deparmeant;
	}
	public void setDeparmeant(String deparmeant) {
		this.deparmeant = deparmeant;
	}
	public double getSalry() {
		return salry;
	}
	public void setSalry(double salry) {
		this.salry = salry;
	}
	public EmpVo(int empId, String name, String city, String deparmeant, double salry) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.deparmeant = deparmeant;
		this.salry = salry;
	}
	public EmpVo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
