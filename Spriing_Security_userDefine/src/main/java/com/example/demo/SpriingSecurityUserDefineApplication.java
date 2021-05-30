package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.zafar.controller,com.example.pojo,com.zafar.security.user.creation"})
public class SpriingSecurityUserDefineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpriingSecurityUserDefineApplication.class, args);
	}

}
