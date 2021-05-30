package com.grwts.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.grwts.student.controller.StudentController;

@Configuration
public class StudentConfiguration {
	@Bean("student")
	public Logger getLogger() {
		return LoggerFactory.getLogger(StudentController.class);
	}
	
	


}
