package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Customer;
import com.example.repository.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepo customerRepo;

	public void addCustomer(Customer customer) {
		customer.setName("abhi");
		customerRepo.save(customer);
	} 
	
}
