package com.schoolexam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schoolexam.logger.LoggerUtility;



@RestController
@CrossOrigin()
public class HelloWorldController {
	
	@Autowired
	LoggerUtility logger;
	
	@RequestMapping({ "/hello" })
	public String hello() {
		logger.log("hello");
		return "Hello World";
	}

}
