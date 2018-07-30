package com.fil;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
	
	@Bean
	public  LibService myAOPService(){
		return new LibServiceImp();
	}
	
//	@Bean
//	public AOPServiceUser getServiceUser(){
//		return new AOPServiceUser();
//	}
	
//	@Bean
//	LoginService loginService(){
//		return new LoginServiceImp1();
//	}
//	
//	@Bean
//	LoginChecker loginChecker(){
//		return new LoginChecker1();
//	}
	
	@Bean
	LibLogAspect libLogAspect(){
		return new LibLogAspect();
	}
	
	
}
