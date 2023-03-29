package com.schoolexam;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;
@SpringBootApplication
@CrossOrigin()
public class SchoolexamApplication {
	@Value("${spring.application.name}")
	private String name;
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolexamApplication.class, args);
	}
	@GetMapping(value = "/")
	   public String name() {
	      return name;
	   }
}
