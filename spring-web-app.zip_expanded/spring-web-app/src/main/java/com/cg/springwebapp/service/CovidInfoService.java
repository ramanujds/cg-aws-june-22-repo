package com.cg.springwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.springwebapp.model.Country;

@Service
public class CovidInfoService {

	private String covidInfoUri =  "https://covid19.mathdro.id/api/countries/";
	
	@Autowired
	private RestTemplate covidClient;
	
	public Country getCovidData(String countryName) {
		Country countryInfo = this.covidClient.getForObject(covidInfoUri+countryName, Country.class);
		return countryInfo;
	}
	
}
