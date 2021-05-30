package com.grwts.controller;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableWebSecurity
public class HelloWorldController {
@GetMapping( path="/hello")
	public String display()
	{
		return "Hello World!!";
	}

}
