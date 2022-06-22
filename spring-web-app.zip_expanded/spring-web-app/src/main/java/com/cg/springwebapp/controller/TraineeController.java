package com.cg.springwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.springwebapp.model.Trainee;

@Controller
public class TraineeController {

//	@PostMapping("/add-trainee")
//	public String addTrainee(@RequestParam("tname") String traineeName,
//								@RequestParam("domain") String domain, 
//								@RequestParam("email") String email, Model m) {
//		System.out.println("Added Trainee..");
//		m.addAttribute("tname",traineeName);
//		m.addAttribute("domain",domain);
//		m.addAttribute("email",email);
//		return "show-trainee.jsp";
//	}
//	
	
	@PostMapping("/add-trainee")
	public String addTrainee(@ModelAttribute("trainee") Trainee trainee) {
		return "show-trainee";
	}
	
	
}
