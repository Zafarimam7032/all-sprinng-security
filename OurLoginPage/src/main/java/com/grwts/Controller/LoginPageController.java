package com.grwts.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginPageController {

	@GetMapping("/login")
	public String page() {
		return "login";
	}

	@GetMapping(path = "/success")
	public String getSuccessPage() {
		return "success";
	}

}
