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
@EnableWebSecurity
public class CustomUserIdaAndPassword extends WebSecurityConfigurerAdapter {
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	

	
	public CustomUserIdaAndPassword() {
		super();

	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/","index","/css/*","/js/*")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
	}
	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
	UserDetails userDetails = User.builder().username("Zafar").password(passwordEncoder.encode("1234")).roles("employee").build();
	return new InMemoryUserDetailsManager(userDetails);
	
		
	}


}
