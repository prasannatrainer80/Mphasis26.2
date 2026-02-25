package com.java.spr;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeleteEmployNewMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number   ");
		empno = sc.nextInt();
		ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
    EmployDaoImplNew employDao = context.getBean(EmployDaoImplNew.class);
		System.out.println(employDao.deleteEmploy(empno));	
	}
}
