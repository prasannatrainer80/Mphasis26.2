package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployShowMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new 
			ClassPathXmlApplicationContext("com/java/spr/jdbc.xml");
		EmployDao employDao = (EmployDao)ctx.getBean("employDaoImpl");
		employDao.showEmploy().forEach(System.out::println);
	}
}
