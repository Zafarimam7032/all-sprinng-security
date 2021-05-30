package com.zafar.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zafar.main.UserDetails;
import com.zafar.main.UserRepository;
@Component
public class ControllerHelper {
	@Autowired
	private UserRepository userRepository;

	public UserDetails getData(String name) {
		UserDetails userdetails = userRepository.findByUsername(name);
		return userdetails;
	}
	public UserDetails postData(UserDetails Userdetails)
	{
		UserDetails userDetails2 = userRepository.save(Userdetails);
		return userDetails2;
	}
}
