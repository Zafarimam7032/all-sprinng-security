package com.zafar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("-------------------------sfdsdfsdfds-------------");
	}
	@GetMapping(path="/")
	public String home()
	{
		return "this is  home page of this website welcome you ";
		
	}
	@GetMapping(path="/user")
	public String user() {
		return "this is user page ";
		
	}
	@GetMapping(path="/admin")
	public String admin()
	{
		return "this is admin page";
	}

}
