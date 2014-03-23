package com.vassilis.model;

import org.springframework.stereotype.Service;

@Service("twitter")
public class Twitter {
	private String username;
	private String text;
	private String password;
	private boolean updatedWithEmail;
	private String dbName;
	
	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public boolean isUpdatedWithEmail() {
		return updatedWithEmail;
	}

	public void setUpdatedWithEmail(boolean updatedWithEmail) {
		this.updatedWithEmail = updatedWithEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Twitter() {
	}
	
	public Twitter(String username) {
		this.username=username;
	}
}