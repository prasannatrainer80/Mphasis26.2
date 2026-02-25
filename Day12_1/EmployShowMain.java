package com.java.spr;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployShowMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new 
	AnnotationConfigApplicationContext(AppConfig.class);
		EmployDaoImpl dao = ctx.getBean(EmployDaoImpl.class);
		dao.showEmploy().forEach(System.out::println);
		
	}
}
