package com.camel.example;

import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class MyAppConfig {
	 @Autowired
	  CamelContext camelContext;

	
}
