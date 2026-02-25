package com.java.hib;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextHelper {
	public EmployDao getSession() {
		 ApplicationContext ctx =
			     new ClassPathXmlApplicationContext("com/java/hib/jdbc.xml");

			        EmployDao dao = 
			        		(EmployDao) ctx.getBean("employDao");
			     return dao;
	}
}
