package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShowEmployNewMain {
	public static void main(String[] args) {
		  ApplicationContext context =
	                new AnnotationConfigApplicationContext(AppConfig.class);

	        EmployDaoImplNew dao = context.getBean(EmployDaoImplNew.class);
	        dao.showEmploy().forEach(System.out::println);
	}
}
