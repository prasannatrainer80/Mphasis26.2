package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.EmployNotFoundException;
import com.example.demo.model.Employ;
import com.example.demo.repo.EmployRepository;


@Service
public class EmployService {

	@Autowired
	private EmployRepository repo;
	
	public Employ searchEmploy(int empno) {
	    return repo.findById(empno)
	            .orElseThrow(() -> new EmployNotFoundException("Employ No Not Found..."));
	}
	
	public String deleteEmploy(int empno) {
		Employ employ = searchEmploy(empno);
		repo.delete(employ);
		return "Employ Record Deleted...";
	}
	
	public String updateEmploy(Employ employ) {
		repo.save(employ);
		return "Employ Record Updated...";
	}
	
	public String addEmploy(Employ employ) {
		repo.save(employ);
		return "Employ Record Inserted...";
	}
	
	public List<Employ> showByGender(String gender) {
		return repo.findByGender(gender);
	}
	
	public List<Employ> showByDept(String dept) {
		return repo.findByDept(dept);
	}
	
	public List<Employ> showByDeptAndGender(String dept,
			String gender) {
		return repo.findByDeptAndGender(dept, gender);
	}
	
	public List<Employ> showEmploy() {
		return repo.findAll();
	}
}
