package com.vision.main.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class ApplicationConfiguration {
	
	@Value("${trade.key}")
    private String tradekey;
    
	@Value("${spring.datasource.username}")
    private String someKey;
	
	public String getSomeKey() {
		return someKey;
	}

	public String getTradekey() {
		return tradekey;
	}

}
