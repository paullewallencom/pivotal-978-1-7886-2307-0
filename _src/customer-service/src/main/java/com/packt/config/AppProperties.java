package com.packt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@RefreshScope
public class AppProperties {
	
	@Value("${shared.properties.courseName}")
	private String courseName;
	
	@Value("${shared.properties.hazelcastConnectionString}")
	private String hazelcastConnectionString;
	
	@Value("${myApp.properties.hello-dev}")
	private String helloDev;
	
	@Value("${myApp.properties.hello}")
	private String hello;
	
}
