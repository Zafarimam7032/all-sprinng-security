package com.grwts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.Vo.StudentVo;

@RestController
@RequestMapping(path = "/home/student")
public class StudentController {
	@GetMapping(path = "get/all")
	public StudentVo display()
	{
		return new StudentVo(1, "Zafar imam","New Delhi", "7032871006", "JNtuh");
	}

}
