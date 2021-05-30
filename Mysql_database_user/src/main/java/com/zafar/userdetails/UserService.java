package com.zafar.userdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.zafar.main.DbConnection;
import com.zafar.main.Userdetails;
@Service
public class UserService implements  UserDetailsService {
	@Autowired
	DbConnection dbConnection;

	public UserService() {
		super();
		System.out.println("---------------------------------------------------");
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Userdetails userdetails = dbConnection.findByUsername(username);
		System.out.println(userdetails);
		return new MyUserDetails(userdetails);
	}
	

}
