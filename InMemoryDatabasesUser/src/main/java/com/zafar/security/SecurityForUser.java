package com.zafar.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
@EnableWebSecurity
public class SecurityForUser extends WebSecurityConfigurerAdapter {
	@Autowired
	DataSource datasource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		try {
		auth.jdbcAuthentication().dataSource(datasource)
		.usersByUsernameQuery("select username,password,enabled from users where username=?")
		.authoritiesByUsernameQuery("select username,authority from authorities where username=?");
		}
		catch (Exception e) {
	System.out.println("server is not working properly");
		}
		
//		.withDefaultSchema()
//				.withUser(User.withUsername("user").password("user").roles("USER"))
//				.withUser(User.withUsername("admin").password("admin").roles("ADMIN"));
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/user").hasAnyRole("USER", "ADMIN").antMatchers("/admin").hasRole("ADMIN")
				.antMatchers("/").permitAll().and().formLogin();
	}
	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}

}
