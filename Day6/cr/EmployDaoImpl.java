package com.java.hib.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.java.hib.model.Employ;
import com.java.hib.util.SessionHelper;

public class EmployDaoImpl {

	SessionFactory sessionFactory;
	Session session;
	
	public long totalRecords() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.setProjection(Projections.rowCount());
		long count =(Long)cr.uniqueResult();
		return count;
	}
	public List<String> showNames() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.setProjection(Projections.property("name"));
		return cr.list();
	}
	public List<Employ> showByBasicDesc() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.addOrder(Order.desc("basic"));
		return cr.list();
	}
	
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
