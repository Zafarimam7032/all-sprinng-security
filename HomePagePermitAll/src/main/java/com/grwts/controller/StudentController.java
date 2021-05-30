package com.grwts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.vo.StudentVo;

@RestController
public class StudentController {
	 @GetMapping(path = "/student")
	 public StudentVo displayStudentVo()
	 {
		 return new StudentVo(1, "Zafar imam", "New Delhi", "3222322");
	 }
	 

}
