package com.java.hib;

import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.java.hib.model.Login;
import com.java.hib.util.SessionHelper;

public class LoginCheck {
	public static void main(String[] args) {
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName  ");
		user = sc.next();
		System.out.println("Enter Password  ");
		pwd = sc.next();
		SessionFactory sf = SessionHelper.getSession();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Login.class);
		cr.add(Restrictions.eq("userName", user));
		cr.add(Restrictions.eq("passCode", pwd));
		cr.setProjection(Projections.rowCount());
		Long count = (Long)cr.uniqueResult();
		System.out.println(count);
		if (count==1) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
