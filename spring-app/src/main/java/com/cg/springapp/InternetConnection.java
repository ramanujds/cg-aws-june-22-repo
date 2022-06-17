package com.cg.springapp;

import org.springframework.stereotype.Component;

@Component
public class InternetConnection {

	public void connect() {
		System.out.println("Connection Established");
	}
	
	public void browseInternet() {
		System.out.println("Browsing internet..");
	}
	
}
