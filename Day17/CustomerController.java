package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;


@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping(value="/showcustomer")
	public ResponseEntity<List<Customer>> showCustomer() {
		return ResponseEntity.ok(customerService.showCustomer());
	}
	
	@GetMapping(value="/customerlogin/{user}/{pwd}")
	public ResponseEntity<String> login(
			@PathVariable
			String user, @PathVariable String pwd) {
		return ResponseEntity.ok(
	            customerService.loginCustomer(user, pwd)
	    );
	}
	
	@GetMapping(value="/searchcustomer/{id}")
	public ResponseEntity<Customer> searchByCustomerId(@PathVariable int id) {
		return ResponseEntity.ok(customerService.searchByCustomerId(id));
	}
	
	@GetMapping(value="/customeruser/{user}")
	public ResponseEntity<Customer> customerUser(@PathVariable String user) {
		return ResponseEntity.ok(customerService.searchByuserName(user));
	}
}
