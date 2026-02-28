package com.java.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("employservice")
public class EmployService {

	private static ApplicationContext context;
	private static EmployDao employDao;
	
	static {
		context = 
		new ClassPathXmlApplicationContext("com/java/rest/jdbc.xml");
		employDao = (EmployDaoImpl)context.getBean("employDaoImpl");
	}

	@GET
	@Path("/showemploy")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employ> showEmploy() {
		return employDao.showEmploy();
	}
}
