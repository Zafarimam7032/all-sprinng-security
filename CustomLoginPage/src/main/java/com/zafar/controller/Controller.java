package com.zafar.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping(path = "/login",method = RequestMethod.GET)
	public String customeLoginPage(Model model)
	{
		return "Login";
	}
	@GetMapping("/display")
	public String display()
	{
		return "this is second page";
	}

}
