package com.zafar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.StudentVo;

@RestController
@RequestMapping(path = "/student")
public class Controller {
	@Autowired
	StudentVo studentVo;

	@GetMapping(path = "/display")
	public StudentVo display() {
		studentVo.setId(1);
		studentVo.setName("Zafar Imam");
		studentVo.setCity("New Delhi");
		studentVo.setMobileNuber("34345345");
		studentVo.setDepartment("java Devloper");
		return studentVo;
	}
}
