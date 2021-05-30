package com.grwts.student.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Security_Z")
public class StudentVo {
	@Id
	private int id;
	private String name;
	private String city;
	private String collegeName;

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

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public StudentVo(int id, String name, String city, String collegeName) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.collegeName = collegeName;
	}

	public StudentVo() {
		super();
	}

	@Override
	public String toString() {
		return "StudentVo [id=" + id + ", name=" + name + ", city=" + city + ", collegeName=" + collegeName + "]";
	}

}
