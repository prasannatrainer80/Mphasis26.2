package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Orders;
import com.example.demo.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	
	@GetMapping(value="/customerOrders/{custId}")
	public List<Orders> customerOrders(@PathVariable int custId) {
		return orderService.showCustomerOrders(custId);
	}
	
	@GetMapping(value="/customerPendingOrders/{custId}")
	public List<Orders> customerPendingOrders(@PathVariable int custId) {
		return orderService.showCustomerPendingOrders(custId);
	}
	@PostMapping(value="/placeOrder")
	public String placeOrder(@RequestBody Orders order) {
		return orderService.palceOrder(order);
	}
}
