package com.packt.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.packt.service.CustomerService;
import com.packt.service.TextModifierService;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	private TextModifierService textModifierService;
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String getCustomer(@RequestParam String lastName) {
		
		return customerService.retrieveCustomerFromDB(lastName);
	}
	
}
