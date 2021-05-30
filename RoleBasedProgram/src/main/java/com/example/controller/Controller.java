package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	public String homePage() {
		return "this is home page";
	}
@GetMapping("/user")
	public String user() {
		return "welcome  to user:";
	}
@GetMapping("/admin")
	public String admin() {
		return "welcome admin";
	}
}
