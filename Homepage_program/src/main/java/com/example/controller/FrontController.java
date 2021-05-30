package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/home")
public class FrontController {
	@GetMapping(path = "/display")
	public String display()
	{
		return "welcome to to my page";
	}

	@GetMapping("/work")
	public String checkworkingdisable() {
		
		return "working home";
		
	}
	
}
