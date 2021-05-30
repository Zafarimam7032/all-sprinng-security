package com.zafar.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@ComponentScan({ "com.zafar.controller,com.zafar.helper,.zafar.db.userrepo.copy,com.zafar.userdetails" })
public class JwtImplimentationPracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(JwtImplimentationPracticeApplication.class, args);

	}

//	@Bean
//	public Class<UserRepository> getUserRepository() {
//		return UserRepository.class;
//	}
}
