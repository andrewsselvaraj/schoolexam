package com.schoolexam.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.slf4j.MDC;



@Service
public class LoggerUtility {
	private static final Logger logger = LoggerFactory.getLogger(LoggerUtility.class);
	
	public void log(String message)
	{
		MDC.put("username", "johndoe");
		logger.info("User logged in");
		logger.info(message);
	}
	
	public void log(String message, String type)
	{
		logger.info(message, type);
	}
}
