package com.fil;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
	@Bean
	LoginService loginService(){
		return new LoginServiceImp1();
	}
	
	@Bean
	LoginChecker loginChecker(){
		return new LoginChecker1();
	}
	
	
	
}
