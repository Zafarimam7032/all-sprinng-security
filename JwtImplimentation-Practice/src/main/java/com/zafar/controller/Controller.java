package com.zafar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zafar.helper.ControllerHelper;
import com.zafar.main.UserDetails;

@RestController
@RequestMapping(path = "/user")
public class Controller {
	@Autowired
	private ControllerHelper conhelper;

	@GetMapping(path = "/{uid}")
	protected UserDetails show(@PathVariable("uid") String username) {
		UserDetails userdetsils = conhelper.getData(username);
		return userdetsils;
	}

	@PostMapping(path="/insert")
	public UserDetails insert(@RequestBody UserDetails userDetails) {
		UserDetails postData = conhelper.postData(userDetails);
		return postData;
	}
}
