package com.fil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.jdbc.core.JdbcTemplate;  

@Controller
public class WelcomeController {
	@Autowired
	JdbcTemplate jdbc;
	
	//private WelcomeService service;

	//@RequestMapping("/index")
	//@ResponseBody
	@GetMapping("/")
	public String welcome(){
		return "index";
	}
	
	@GetMapping("/index2")
	public String index2(){
		return "index2";
	}
	@GetMapping("/ajax_info")
	public String ajax_info()
	{
		return "ajax_info.txt";
	}
	
	
	@RequestMapping("/insert")
	@ResponseBody
	public String insert(){
		jdbc.execute("insert into Employee values(3,2,2,2,2)");
		return "inserted";
	}
	
}
