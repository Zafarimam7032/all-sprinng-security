package com.zafar.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.zafar.security,com.zafar.controller"})
public class CustomLoginPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomLoginPageApplication.class, args);
	}

}
