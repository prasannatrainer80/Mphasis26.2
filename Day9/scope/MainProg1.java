package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg1 {
	public static void main(String[] args) {
		ApplicationContext ctx = 
	new ClassPathXmlApplicationContext("com/java/spr/hello.xml");
		HelloWorld obj1 = (HelloWorld)ctx.getBean("beanHello");
		HelloWorld obj2 = (HelloWorld)ctx.getBean("beanHello");
		HelloWorld obj3 = (HelloWorld)ctx.getBean("beanHello");
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

	}
}
