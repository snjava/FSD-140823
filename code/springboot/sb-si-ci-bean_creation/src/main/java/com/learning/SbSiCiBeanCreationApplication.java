package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.learning.dto.DbConnection;

@SpringBootApplication
public class SbSiCiBeanCreationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbSiCiBeanCreationApplication.class, args);
		//DbConnection db = ctx.getBean(DbConnection.class);
		DbConnection db = ctx.getBean("oracle", DbConnection.class);
		db.printDbDetails();
	}
	
	//@Primary
	@Bean("mysql")
	public DbConnection getMySqlDbConn() {
		DbConnection db = new DbConnection();
		db.setDriver("MySql-Driver");
		db.setUrl("Mysql-URL");
		db.setUsername("MySql-Username");
		db.setPassword("MySql-Pasword");
		return db;
	}
	
	@Bean("oracle")
	public DbConnection getOracleDbConn() {
		DbConnection db = new DbConnection();
		db.setDriver("Oracle-Driver");
		db.setUrl("Oracle-URL");
		db.setUsername("Oracle-Username");
		db.setPassword("Oracle-Pasword");
		return db;
	} 

}
