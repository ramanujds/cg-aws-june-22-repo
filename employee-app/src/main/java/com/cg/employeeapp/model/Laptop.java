package com.cg.employeeapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {

	@Id
	private long id;
	private String model;
	private String brand;
	private int ram;
	
	public Laptop() {
	}

	public Laptop(long id, String model, String brand, int ram) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.ram = ram;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", model=" + model + ", brand=" + brand + ", ram=" + ram + "]";
	}

	
	
	
}
