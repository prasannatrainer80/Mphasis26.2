package com.java.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = 
	new ClassPathXmlApplicationContext("com/java/aop/aop.xml");
		JavaFsdTraining javaFsd =
				(JavaFsdTraining) ctx.getBean("beanJavaFsd");
		javaFsd.showInfo("batch3");
		System.out.println("----------------------------------");
		javaFsd.location();
	}
}
