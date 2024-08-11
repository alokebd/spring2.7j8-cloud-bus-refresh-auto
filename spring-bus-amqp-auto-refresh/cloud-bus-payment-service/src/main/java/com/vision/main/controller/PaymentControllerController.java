package com.vision.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vision.main.config.ApplicationConfiguration;
import com.vision.main.config.PaymentConfiguration;

@RestController
@RefreshScope
public class PaymentControllerController {
	
	@Autowired
	private ApplicationConfiguration applicationConfiguration;
	
    @GetMapping
    public String printKey() {
        return "Payment properties -> trade key = " + applicationConfiguration.getTradekey() +" -> Db username = " + applicationConfiguration.getSomeKey();
    }
    
	
	@Autowired
	private PaymentConfiguration configuration;
	
	@GetMapping("/values")
	public String getAllValues() {
		return "Payment Configuration: host->" + configuration.getHost() + "port->" + configuration.getPort() + "password:->" + configuration.getUsername() + ":->"
				+ configuration.getPassword();
	}
}
