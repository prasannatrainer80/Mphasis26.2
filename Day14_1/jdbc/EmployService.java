package com.java.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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

	 @POST
	 @Path("/addemploy/")
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Produces(MediaType.APPLICATION_JSON)
	 public String insertEmploy(final Employ e) {
		  return employDao.addEmploy(e);
	 }

	  @DELETE
	  @Path("/employdelete/{empno}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public String deleteEmploy(@PathParam("empno") int empno) {
		  return employDao.deleteEmploy(empno);
	  }
	
	  @PUT
	  @Path("/updateemploy/")
	  @Consumes(MediaType.APPLICATION_JSON)
	  @Produces(MediaType.APPLICATION_JSON)
	  public String updateEmploy(final Employ e) {
		  return employDao.updateEmploy(e);
	  }

	
	@GET
	@Path("/searchemploy/{empno}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employ searchEmploy(@PathParam("empno") int empno) {
		return employDao.searchEmploy(empno);
	}
	
	@GET
	@Path("/showemploy")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employ> showEmploy() {
		return employDao.showEmploy();
	}
}
