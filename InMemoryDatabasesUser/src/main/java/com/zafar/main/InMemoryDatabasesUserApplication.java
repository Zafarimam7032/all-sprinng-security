package com.zafar.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.zafar.security,com.zafar.conroller"})
public class InMemoryDatabasesUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(InMemoryDatabasesUserApplication.class, args);
	}

}
