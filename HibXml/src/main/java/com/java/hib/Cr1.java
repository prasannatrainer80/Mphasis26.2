package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.java.hib.model.Employ;
import com.java.hib.util.SessionHelper;

public class Cr1 {
	public static void main(String[] args) {
		SessionFactory sf = SessionHelper.getSession();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		List<Employ> employList = cr.list();
		employList.forEach(System.out::println);
	}
}
