package com.java.hib.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.java.hib.model.Employ;
import com.java.hib.util.SessionHelper;

public class EmployDaoImpl implements EmployDao {

	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public List<Employ> showEmploy() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Employ");
		return query.list();
	}

}
