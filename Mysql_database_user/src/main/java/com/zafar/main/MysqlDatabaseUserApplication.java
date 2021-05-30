package com.zafar.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses =  DbConnection.class)
@ComponentScan({"com.zafar.security.mang,com.zafar.userdetails,com.zafar.controller"})
public class MysqlDatabaseUserApplication {
	

	public MysqlDatabaseUserApplication() {
		super();
		System.out.println();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SpringApplication.run(MysqlDatabaseUserApplication.class, args);
	}

}
