package com.fil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	@Autowired
	private WelcomeService service;
	
	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome(){
		return service.retrieveWelcomeMessage();
	}
	
}
