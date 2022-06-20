package com.cg.springwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping("/hello")
	public String sayHello() {
		return "hello.html";
	}
	
}
