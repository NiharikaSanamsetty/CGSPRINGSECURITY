package com.spring.security1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCon {
	
	
	@GetMapping("/admin")
	public String admin()
	{	
		return "Welcome Admin";
	}
	

}
