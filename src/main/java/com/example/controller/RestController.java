package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.entity.Customer;
import com.example.service.CustomerService;

@Controller("/")
public class RestController {
	
	@Autowired
	CustomerService customerService;

	@GetMapping("add")
	public void addCustomer(Customer customer) {
		customerService.addCustomer(customer);
	}
	
}
