package com.grwts.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import static com.grwts.role.RoleDefine.*;

@EnableWebSecurity
public class StudentSecurityManagement extends WebSecurityConfigurerAdapter {
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		UserDetails userDetails = User.builder().username("Zafar").password( passwordEncoder.encode("1234")).roles(STUDENT.name()).build();

		UserDetails userDetails2 = User.builder().username("Ateef").password( passwordEncoder.encode("1234")).roles(ADMIN.name()).build();
		return new InMemoryUserDetailsManager(userDetails, userDetails2);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/home/student/**").hasRole(ADMIN.name())
		.anyRequest().authenticated().and()
				.httpBasic();
	}

}
