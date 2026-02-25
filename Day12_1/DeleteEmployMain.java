package com.java.spr;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DeleteEmployMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		ApplicationContext ctx = new 
				AnnotationConfigApplicationContext(AppConfig.class);
					EmployDaoImpl dao = ctx.getBean(EmployDaoImpl.class);
		System.out.println(dao.deleteEmploy(empno));
	}
}
