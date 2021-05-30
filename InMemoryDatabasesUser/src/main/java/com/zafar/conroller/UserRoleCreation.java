package com.zafar.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserRoleCreation {
	@GetMapping("/")
	public String all() {
		return "this is home page";

	}
	@GetMapping("/user")
	public String user() {
		return "this is user homepage";

	}
	@GetMapping("/admin")
	public String admin() {
		return "this is is admin";

	}
}
