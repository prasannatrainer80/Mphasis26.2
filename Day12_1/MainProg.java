package com.java.hib;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		 ApplicationContext ctx =
	     new ClassPathXmlApplicationContext("com/java/hib/jdbc.xml");

	        EmployDao dao = 
	        		(EmployDao) ctx.getBean("employDao");
	        List<Employ> employList = dao.getAllEmploys();
	        employList.forEach(System.out::println);
	}
}
