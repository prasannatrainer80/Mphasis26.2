package com.java.mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.mvc.model.Employ;

@Controller
public class HomeController {

	private static List<Employ> employList = new ArrayList<>(Arrays.asList(
		    new Employ(1, "Mythri", "FEMALE", "Java", "Programmer", 84824),
		    new Employ(2, "Aakash", "MALE", "Java", "Expert", 90886),
		    new Employ(3, "Shakeeb", "MALE", "Dotnet", "Programmer", 92824),
		    new Employ(4, "Rishika", "FEMALE", "Java", "TL", 89022),
		    new Employ(5, "Sravan", "MALE", "Sql", "Admin", 97222)
		));
	
	@RequestMapping(value="/deleteemploy")
	public ModelAndView deleteEmploy(HttpServletRequest request) {
		int empno = Integer.parseInt(request.getParameter("empno"));
		Employ employFound = null;
		for (Employ employ : employList) {
			if (employ.getEmpno() == empno) {
				employFound = employ;
				break;
			}
		}
		employList.remove(employFound);
		return new ModelAndView("redirect:/showemploy");
	}
	
	@RequestMapping(value="/updatefinal")
	public ModelAndView updateFinal(@ModelAttribute Employ employUpdated) {
		for (Employ employ : employList) {
			if (employ.getEmpno() == employUpdated.getEmpno()) {
				employ.setName(employUpdated.getName());
				employ.setGender(employUpdated.getGender());
				employ.setDept(employUpdated.getDept());
				employ.setDesig(employUpdated.getDesig());
				employ.setBasic(employUpdated.getBasic());
				break;
			}
		}
//		employDao.updateEmploy(employUpdated);
		return new ModelAndView("redirect:/showemploy");
	}

	
	@RequestMapping(value="/updateemploy")
	public ModelAndView updateEmploy(HttpServletRequest request) {
		int empno = Integer.parseInt(request.getParameter("empno"));
		Employ employFound = null;
		for (Employ employ : employList) {
			if (employ.getEmpno() == empno) {
				employFound = employ;
				break;
			}
		}
		return new ModelAndView("updateemploy","employ",employFound);
	}

	
	@RequestMapping(value = "/saveemploy", method = RequestMethod.POST)
	public ModelAndView saveEmploy(@ModelAttribute Employ employNew) {
		System.out.println(employNew);
	    employList.add(employNew);
	    return new ModelAndView("redirect:/showemploy");
	}

	@RequestMapping(value="/addemploy")
	public ModelAndView addEmploy() {
		return new ModelAndView("addemploy");
	}
	
	@RequestMapping(value="/showemploy")
	public ModelAndView showEmploy() {
		return new ModelAndView("showemploy","employList",employList);
	}
	
	@RequestMapping(value="/nameresult")
	public ModelAndView nameRequest(HttpServletRequest request) {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String fullName = firstName + " " +lastName;
		ModelAndView mv = new ModelAndView("nameresult");
		mv.addObject("firstName",firstName);
		mv.addObject("lastName",lastName);
		mv.addObject("fullName",fullName);
		return mv;
	}
	
	@RequestMapping(value="/shownames")
	public ModelAndView show() {
		List<String> names = new ArrayList<String>();
		names.add("Srinivas");
		names.add("Bala");
		names.add("Kabila");
		names.add("Arvind");
		names.add("Satish");
		names.add("Suganya");
		return new ModelAndView("shownames","names",names);
	}
	
	@RequestMapping(value="/loginauth")
	public ModelAndView auth(HttpServletRequest req) {
		String user = req.getParameter("userName");
		String pwd = req.getParameter("passCode");
		if (user.equals("Mphasis") && pwd.equals("Mphasis")) {
			return new ModelAndView("menu");
		} else {
			return new ModelAndView("login","error","Invalid Credentials...");
		}
	}
	
	@RequestMapping(value="/login")
	public ModelAndView loginForm() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/demoform")
	public ModelAndView demoForm() {
		return new ModelAndView("demoform");
	}
	
	@RequestMapping(value="/nameform")
	public ModelAndView nameForm() {
		return new ModelAndView("nameform");
	}
	
	@RequestMapping(value="/demoshow")
	public ModelAndView demoshow(HttpServletRequest req) {
		String sname = req.getParameter("sname");
		return new ModelAndView("demoshow","sname",sname);
	}
	
	@RequestMapping(value="/manoj")
	public ModelAndView manoj() {
		return new ModelAndView("manoj");
	}
	
	@RequestMapping(value="/arvind")
	public ModelAndView arvind() {
		return new ModelAndView("arvind");
	}
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
