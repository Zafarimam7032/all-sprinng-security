package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.controller,com.zafar.user.creater"})
public class RoleBasedProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleBasedProgramApplication.class, args);
	}

}
