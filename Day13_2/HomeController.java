package com.java.mvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.mvc.dao.EmployDao;
import com.java.mvc.model.Employ;

@Controller
public class HomeController {

	@Autowired
	private EmployDao employDao;

	@RequestMapping(value="/updateemploy")
	public ModelAndView updateEmploy(HttpServletRequest request) {
		int empno = Integer.parseInt(request.getParameter("empno"));
		Employ employ = employDao.searchEmploy(empno);
		return new ModelAndView("updateemploy","employ",employ);
	}
	
	
	@RequestMapping(value="/deleteemploy")
	public ModelAndView deleteEmploy(HttpServletRequest req) {
		int empno = Integer.parseInt(req.getParameter("empno"));
		employDao.deleteEmploy(empno);
		return new ModelAndView("redirect:/showemploy");
	}


	@RequestMapping(value="/updatefinal")
	public ModelAndView updateFinal(@ModelAttribute Employ employUpdated) {
		employDao.updateEmploy(employUpdated);
		return new ModelAndView("redirect:/showemploy");
	}

	
	@RequestMapping(value="/loginresult")
	public ModelAndView test(HttpServletRequest request) throws IOException
	{
		String user = request.getParameter("userName");
		String pwd = request.getParameter("passCode");
		int res = employDao.login(user, pwd);
		if (res==1) {
			return new ModelAndView("redirect:/showemploy");
		}
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/showemploy")
	public ModelAndView showEmploy() {
		List<Employ> employList = employDao.showEmploy();
		return new ModelAndView("home","employList",employList);
	}
	


	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("login");
	}
}
