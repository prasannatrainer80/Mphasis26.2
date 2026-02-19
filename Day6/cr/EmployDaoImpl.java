package com.java.hib.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.java.hib.model.Employ;
import com.java.hib.util.SessionHelper;

public class EmployDaoImpl {

	SessionFactory sessionFactory;
	Session session;
	
	public Employ searchEmploy(int empno) {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.eq("empno", empno));
		return (Employ)cr.uniqueResult();
	}
	
	public List<Employ> showEmploy() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		return cr.list();
	}
}
