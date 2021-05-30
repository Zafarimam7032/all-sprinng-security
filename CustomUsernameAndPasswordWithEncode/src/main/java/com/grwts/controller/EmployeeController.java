package com.grwts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.vo.EmployeeVo;

@RestController
public class EmployeeController {
	@GetMapping(path = "/display")
	public EmployeeVo display()
	{
		return new EmployeeVo(1, "Zafar", "New Delhi", 10000.0);
	}
	

}
