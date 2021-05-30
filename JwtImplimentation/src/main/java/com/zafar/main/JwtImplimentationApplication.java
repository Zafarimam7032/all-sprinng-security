package com.zafar.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.zafar.service,com.zafar.controller,com.zafar.sercurity,com.zafar.controller,com.zafar.jwt,com.zafar.filer"})

public class JwtImplimentationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtImplimentationApplication.class, args);
	}

}
