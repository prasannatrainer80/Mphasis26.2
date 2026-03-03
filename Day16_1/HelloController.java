package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping(value="/")
	public String hello() {
		return "hello";
	}
	
	@GetMapping(value="/calcresult")
	public String calcresult(@RequestParam int firstNo, 
				@RequestParam int secondNo,
			Model model) {
		int sum = firstNo + secondNo;
		int sub = firstNo - secondNo;
		int mult = firstNo * secondNo;
		model.addAttribute("sum", sum);
		model.addAttribute("sub", sub);
		model.addAttribute("mult", mult);
		return "calcresult";
	}

	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(defaultValue = "World") String name, Model model) {
		model.addAttribute("title", "Greeting Page");
		model.addAttribute("message", "Hello, " + name + "!");
		return "greeting";
	}
}
