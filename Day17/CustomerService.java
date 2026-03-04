package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public String loginCustomer(String user, String pwd) {
		Customer customer = customerRepository.findByCusUserNameAndCusPassword(user, pwd);
		if (customer!=null) {
			return "1";
		}
		return "0";
	}
	public Customer searchByuserName(String user) {
		Customer customer = customerRepository.findByCusUserName(user);
		System.out.println("Customer  " +customer);
		return customer;
	}
	
	public List<Customer> showCustomer() {
		return customerRepository.findAll();
	}
	
	public Customer searchByCustomerId(int id) {
		return customerRepository.findById(id).get();
	}

}
