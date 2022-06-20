package com.cg.springwebapp.controller;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping("/hello")
	public String sayHello(Model m) {
		LocalTime time = LocalTime.now();
		m.addAttribute("time", time);
		return "show.jsp";
	}
	
}
