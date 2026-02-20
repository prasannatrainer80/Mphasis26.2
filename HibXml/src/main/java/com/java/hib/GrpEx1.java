package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.java.hib.model.Employ;
import com.java.hib.util.SessionHelper;

public class GrpEx1 {
	public static void main(String[] args) {
		SessionFactory sf = SessionHelper.getSession();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.groupProperty("gender"));
		plist.add(Projections.rowCount());
		cr.setProjection(plist);
		List<Object[]> list = cr.list();
		for(Object[] row : list) {
			System.out.println("Gender  " +row[0]);
			System.out.println("Total Employees " +row[1]);
		}

	}
}
