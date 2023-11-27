package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learning.bean.Student;

@SpringBootApplication
public class SpringIntroApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringIntroApplication.class, args);
		Student st = ctx.getBean(Student.class);
		st.printDetails();
	}

}
