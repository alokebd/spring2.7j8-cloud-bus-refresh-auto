package com.vision.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vision.main.config.ApplicationConfig;
import com.vision.main.config.PropertyConfig;

@RestController
public class PropertyController {
	@Autowired
	private PropertyConfig configuration;
	@Autowired
    private ApplicationConfig applicationConfig;
	
    @GetMapping
    public String prop() {
        return " Property Service -> spring.datasource.username = " + applicationConfig.getMyKey();
    }
    
    
    
    @GetMapping("/values")
	public String getAllValues() {
		return configuration.getHost() + "Property Configuration:->" + configuration.getPort() + ":->" + configuration.getUsername() + ":->"
				+ configuration.getPassword();
	}
}
