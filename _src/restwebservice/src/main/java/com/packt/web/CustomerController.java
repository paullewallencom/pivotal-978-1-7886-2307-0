package com.packt.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.packt.model.Customer;
import com.packt.model.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping(value = "/customer", method = RequestMethod.PUT)
	public String putCustomer(@RequestBody Customer customer) {
		Customer savedCustomer = customerRepository.save(customer);
		return savedCustomer.toString();
	}
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String getCustomer(@RequestParam String lastName) {
		return customerRepository.findByLastName(lastName).toString();
	}
}
