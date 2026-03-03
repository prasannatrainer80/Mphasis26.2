package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Employ;
import com.example.demo.service.EmployService;

@Controller
public class EmployController {

    @Autowired
    private EmployService employService;

    @GetMapping("/addemploy")
    public String addNewEmployee(Model model) {
        Employ employ = new Employ();
        model.addAttribute("employ", employ);
        return "addemploy";
    }

    @PostMapping("/savenew")
    public String saveEmploy(@ModelAttribute("employ") Employ employ) {
        employService.addEmploy(employ);
        return "redirect:/";
    }

    
    @PostMapping("/saveemploy")
    public String saveEmployee(@ModelAttribute("employ") 
    	Employ employ) {
        employService.updateEmploy(employ);
        return "redirect:/";
    }

    @GetMapping(value="/updateform/{empno}")
    public String updateForm(@PathVariable(value="empno") int empno,
    		Model model
    		) {
    	Employ employ = employService.searchEmploy(empno);
    	model.addAttribute(employ);
    	return "updateform";
    }
    
    @GetMapping(value="/deleteemploy/{empno}")
    public String deleteemploy(@PathVariable(value="empno") int empno
    		) {
    	employService.deleteEmploy(empno);
    	return "redirect:/";
    }
    
    @GetMapping("/")
    public String showEmploy(Model model) {
        List<Employ> employList = employService.showEmploy();
        model.addAttribute("employList", employList);
        return "employshow";   // employshow.html
    }
}
