package com.packt.service;

import org.springframework.stereotype.Component;

@Component
public class TextModifierService {

	
	public String toUpperCase(String text) {
		return text.toUpperCase();
	}
}
