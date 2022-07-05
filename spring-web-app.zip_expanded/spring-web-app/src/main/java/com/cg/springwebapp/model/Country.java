package com.cg.springwebapp.model;

public class Country {

	private Details confirmed;
	private Details recovered;
	private Details deaths;
	
	public Details getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(Details confirmed) {
		this.confirmed = confirmed;
	}
	public Details getRecovered() {
		return recovered;
	}
	public void setRecovered(Details recovered) {
		this.recovered = recovered;
	}
	public Details getDeaths() {
		return deaths;
	}
	public void setDeaths(Details deaths) {
		this.deaths = deaths;
	}
	
	
	
}
