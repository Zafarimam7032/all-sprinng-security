package com.zafar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zafar.jwt.JwtHelper;
import com.zafar.jwt.ResponseToken;
import com.zafar.service.UserDefineService;
import com.zafar.user.info.JwtTokenHelper;

@RestController
public class JwtTokenGenrator {
	@Autowired
	private UserDefineService userdefine;
	@Autowired
	private JwtHelper jwt;
	@Autowired
	private AuthenticationManager authodication;
	
	@RequestMapping( path="/token",method = RequestMethod.POST)
	public ResponseEntity<?> genrateToken(@RequestBody JwtTokenHelper  jwtHelper) throws Exception
	{
		System.out.println(jwtHelper);
		try {
			this.authodication.authenticate(new UsernamePasswordAuthenticationToken(jwtHelper.getUsername(), jwtHelper.getPassword()));
		} catch (Exception e) {
			throw new Exception("bad cradition");
		}
		UserDetails userDetails = this.userdefine.loadUserByUsername(jwtHelper.getUsername());
		String token = this.jwt.generateToken(userDetails);
		System.out.println(token);
		return ResponseEntity.ok(new ResponseToken(token));
	}
}
