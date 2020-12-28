package com.packt.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Component
public class CustomerService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getBackup")
	public String retrieveCustomerFromDB(String lastName) {
		String request = null;
		try {
			request = restTemplate.getForObject("//customer-1xyz/customer?lastName={lastName}", String.class, lastName);
		} catch (HttpClientErrorException  e) {
			e.printStackTrace();
		}
		return request;
	}
	
	public String getBackup(String lastName) {
		return "some backup text, in case the web service call fails";
	}
}
