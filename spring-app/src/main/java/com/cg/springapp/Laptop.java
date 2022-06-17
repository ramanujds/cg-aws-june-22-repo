package com.cg.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	@Value("${laptop.serial}")
	String serial;
	@Value("${laptop.brand}")
	String brand;
	@Value("${laptop.model}")
	String model;
	
	@Autowired
	InternetConnection connection;
	
	public Laptop() {
	}
	
	
	public Laptop(String serial, String brand, String model) {
		this.serial = serial;
		this.brand = brand;
		this.model = model;
	}
	
	
	public void browseWebsite() {
		connection.browseInternet();
	}
	public void connectToInternet() {
		connection.connect();
	}
	
	public void showLaptopInfo() {
		System.out.println(this);
	}


	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public InternetConnection getConnection() {
		return connection;
	}

	public void setConnection(InternetConnection connection) {
		this.connection = connection;
	}

	
	



	@Override
	public String toString() {
		return "Laptop [serial=" + serial + ", brand=" + brand + ", model=" + model + "]";
	}
	
	
	
	
}
