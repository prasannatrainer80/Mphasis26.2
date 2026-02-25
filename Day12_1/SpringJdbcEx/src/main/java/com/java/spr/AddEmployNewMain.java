package com.java.spr;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddEmployNewMain {
	public static void main(String[] args) {
		Employ employ =new Employ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Name  ");
		employ.setName(sc.next());
		System.out.println("Enter Gender  ");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic  ");
		employ.setBasic(sc.nextDouble());
		 ApplicationContext context =
	                new AnnotationConfigApplicationContext(AppConfig.class);
        EmployDaoImplNew dao = context.getBean(EmployDaoImplNew.class);
        System.out.println(dao.addEmploy(employ));
	}
}
