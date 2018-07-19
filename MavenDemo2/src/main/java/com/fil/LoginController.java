package com.fil;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {


	

		LoginService loginService =new LoginService();
		@RequestMapping(value="/log",method=RequestMethod.GET)
		public String showHello(){
			return "welcome";
		}
		
		
		@RequestMapping(value="/log",method=RequestMethod.POST)
		public String showData(@RequestParam String name,@RequestParam String password,ModelMap model)
		{
			if(loginService.checkValidation(name,password)){
				model.put("name", name);
				model.put("password", password);
				return "welcome";
			}
			else{
				model.put("errorMessage", "Invalid User");
				return "login";
			}
		}
	}
