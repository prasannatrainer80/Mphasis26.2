package com.java.spr;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SearchEmployNewMain {
	public static void main(String[] args) {
		 ApplicationContext context =
	                new AnnotationConfigApplicationContext(AppConfig.class);

	        EmployDaoImplNew dao = context.getBean(EmployDaoImplNew.class);
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter Employ Number   ");
	     int empno = sc.nextInt();
	     Employ employ = dao.searchEmploy(empno);
	     if (employ !=null) {
	    	 System.out.println(employ);
	     } else {
	    	 System.out.println("Employ Record Not FOund");
	     }
	}
}
