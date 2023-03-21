package com.schoolexam.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VaultConfig {
	@Value("")
	private String mysql_username;

	@Value("")
	public String mysql_password;

	
	public String getPassword() {
		return mysql_password;
	}

	public void setPassword(String password) {
		this.mysql_password = password;
	}

	public String getUsername() {
		return mysql_username;
	}

	public void setUsername(String username) {
		this.mysql_username = username;
	}
}
