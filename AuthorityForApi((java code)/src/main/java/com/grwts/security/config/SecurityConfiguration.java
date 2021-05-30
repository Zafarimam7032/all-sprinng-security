package com.grwts.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import static com.grwts.role.aurity.AuthorityForApi.*;
import static com.grwts.role.aurity.RoleForApi.*;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		UserDetails studntDetails = User.builder().username("Zafar").password(passwordEncoder.encode("1234"))
				.authorities(STUDENT.getGrantedAuthorities()).build();
		UserDetails jitendradetails = User.builder().username("Jitendra").password(passwordEncoder.encode("1234"))
				.authorities(ADMIN.getGrantedAuthorities()).build();

		return new InMemoryUserDetailsManager(studntDetails, jitendradetails);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()

				.antMatchers(HttpMethod.DELETE, "/home/student/**").hasAuthority(ADMIN_WRITE.getPermission())
				.antMatchers(HttpMethod.PUT, "/home/student/**").hasAuthority(ADMIN_WRITE.getPermission())
				.antMatchers(HttpMethod.POST, "/home/studnet/**").hasAuthority(ADMIN_WRITE.getPermission())
				.antMatchers(HttpMethod.GET, "/home/student/**").hasAnyRole(ADMIN.name(), STUDENT.name()).anyRequest()
				.authenticated().and().httpBasic();
	}

}
