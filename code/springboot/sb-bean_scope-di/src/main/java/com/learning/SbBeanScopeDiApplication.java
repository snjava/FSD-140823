package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.learning.bean.DbConnection;
import com.learning.bean.Person;

@SpringBootApplication
public class SbBeanScopeDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbBeanScopeDiApplication.class, args);
		Person person1 = ctx.getBean(Person.class);
		/*Person person2 = ctx.getBean(Person.class);
		Person person3 = ctx.getBean(Person.class);
		Person person4 = ctx.getBean(Person.class);
		Person person5 = ctx.getBean(Person.class);*/
		
		person1.printProperties();
	}

	@Primary
	@Bean("mysql")
	public DbConnection getMySqlConn() {
		DbConnection db = new DbConnection();
		db.setDbName("MYSQL Database");
		return db;
	}
	
	@Bean("oracle")
	public DbConnection getOracleConn() {
		DbConnection db = new DbConnection();
		db.setDbName("ORACLE Database");
		return db;
	}
	
}
