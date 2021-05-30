package com.grwts.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentVo {
	private int id;
	private String name;
	private String city;
	private String collegeName;
	private String courseName;

}
