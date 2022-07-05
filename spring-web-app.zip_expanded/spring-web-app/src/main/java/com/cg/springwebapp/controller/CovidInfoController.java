package com.cg.springwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springwebapp.model.Country;
import com.cg.springwebapp.service.CovidInfoService;

@RestController
public class CovidInfoController {

	@Autowired
	CovidInfoService service;
	
	@GetMapping("/country/{country}")
	public Country getCovidInfo(@PathVariable String country) {
		return service.getCovidData(country);
	}
	
}
