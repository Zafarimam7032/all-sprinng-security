package com.zafar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PageController {
	@GetMapping(path = "/")
	public String homePage()
	{
		return "this is home page of my website";
	}
	@GetMapping(path="/first")
	public String firstPage()
	{
		return  "this is page of my website ";
	}
	@GetMapping("/second")
	public String masterPage()
	{
		return "this is master page";
	}
	
}
