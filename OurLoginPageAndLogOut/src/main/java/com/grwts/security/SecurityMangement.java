package com.grwts.security;

import java.util.concurrent.TimeUnit;

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
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.grwts.role.RoleDefination;

@EnableWebSecurity
public class SecurityMangement extends WebSecurityConfigurerAdapter {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		UserDetails zafarDetails = User.builder().username("Zafar").password(passwordEncoder.encode("1234"))
				.roles(RoleDefination.ADMIN.name()).build();
		UserDetails ateefDetails = User.builder().username("Ateef").password(passwordEncoder.encode("1234"))
				.roles(RoleDefination.STUDENT.name()).build();
		return new InMemoryUserDetailsManager(zafarDetails, ateefDetails);

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		
		.authorizeRequests()
		.antMatchers("/home/student/**").hasRole(RoleDefination.ADMIN.name())
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
		.loginPage("/login").permitAll()
		.defaultSuccessUrl("/success",true)
		.and()
		.rememberMe()
		.tokenValiditySeconds((int)TimeUnit.DAYS.toSeconds(10))
		.key("Zafar")
		.and()
		.logout()
		.logoutUrl("/logout")
		
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout","GET"))
		.clearAuthentication(true)
		.invalidateHttpSession(true)
		.deleteCookies("JSESSIONID","iconSize","jenkins-timestamper-offset")
		.logoutSuccessUrl("/login")
		;
	}

}
