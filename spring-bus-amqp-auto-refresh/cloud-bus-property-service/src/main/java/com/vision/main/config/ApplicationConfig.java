package com.vision.main.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class ApplicationConfig {
	
	@Value("${spring.datasource.username}")
    private String myKey;
	
	public String getMyKey() {
		return this.myKey;
	}
	
	

}
