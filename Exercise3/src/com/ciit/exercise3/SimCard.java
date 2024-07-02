package com.ciit.exercise3;

public class SimCard {
	
	public String number;
	public String network;

	public SimCard (String number, String network) {
		
	//by public string setNumber
	this.setNumber(number);
	
	//by public string setNetwork
	this.setNetwork(network);
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNetwork() {
		return network;
	}
	
	public void setNetwork(String network) {
		this.network = network;
	}
	
}

