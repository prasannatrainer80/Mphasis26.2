package com.java.hib;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class EmployDao {

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public int saveEmploy(Employ employ) {
    	System.out.println(employ);
        return (int) hibernateTemplate.save(employ);
    }
    @Transactional
    public void updateEmploy(Employ employ) {
        hibernateTemplate.update(employ);
    }

    @Transactional
    public void deleteEmploy(Employ employ) {
        hibernateTemplate.delete(employ);
    }

    public Employ getEmploy(int empno) {
        return hibernateTemplate.get(Employ.class, empno);
    }

    public List<Employ> getAllEmploys() {
        return hibernateTemplate.loadAll(Employ.class);
    }
}
