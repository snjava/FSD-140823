package com.learning.dto;

public class DbConnection {

	public DbConnection() {
		System.out.println("DB Connection created.....");
	}
	
	private String username;
	private String password;
	private String url;
	private String driver;
	
	public void printDbDetails() {
		System.out.println("Driver : " + driver);
		System.out.println("Url : " + url);
		System.out.println("UserName : " + username);
		System.out.println("Password : " + password);
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
}
