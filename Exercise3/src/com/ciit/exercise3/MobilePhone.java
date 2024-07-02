package com.ciit.exercise3;

public class MobilePhone {
	
	public SimCard simCard;
	public Brand brand;
	public String modelName;
	public String status;
	public boolean isTurnedOn;
	
	public MobilePhone(SimCard simCard, Brand brand, String modelName, boolean isTurnedOn) {
		this.simCard = simCard;
		this.brand = brand;
		this.modelName = modelName;
		this.isTurnedOn = isTurnedOn;	
}
	
	public void swapSimCard (SimCard simCard) {
		this.simCard = simCard;
	}
	
	public void swapSimCards (MobilePhone mobile2) {
		System.out.println("\nSwapping Sim Card of " + this.modelName + " to " + mobile2.modelName);
		MobilePhone temp = new MobilePhone(this.simCard, brand, modelName, isTurnedOn);
		temp.simCard = this.simCard;
		swapSimCard(mobile2.simCard);
		mobile2.simCard = temp.simCard;
		
		System.out.println(this.modelName + "'s mobile number now is " + this.getMobileNumber());
		System.out.println(mobile2.modelName + "'s mobile number now is " + mobile2.getMobileNumber());
	}
	
	public String getMobileNumber() {
		return this.simCard.getNumber();	
	}
	
	public void callMeMaybe (MobilePhone mobilePhone) {
		if (this.isTurnedOn && mobilePhone.isTurnedOn) {
			System.out.println("Calling from " + this.getMobileNumber());
		}else {
			System.out.println("One or two phones are turned off. Please turn on both first.");
		}
	}
	
	public boolean togglePhone() {
		if (!this.isTurnedOn) {
			System.out.println("Turning on " + this.modelName);
			this.isTurnedOn = true;	
		}else if (this.isTurnedOn) {
			System.out.println("Turning off " +this.modelName);
			this.isTurnedOn = false;
		}
		return this.isTurnedOn;
	}
	
	public String getStatus() {
		if (this.isTurnedOn) {
			status = this.modelName + " is turned on";
		}
		else if (!this.isTurnedOn) {
			status = this.modelName + " is turned off";	
		}
		return status;
	}
	
	public void display() {
		System.out.println("Phone name: " + this.modelName);
		System.out.println("Phone brand: " + this.brand.name);
		System.out.println("Mobile number: " + this.getMobileNumber());
		System.out.println("Mobile network: " + this.simCard.getNetwork());
		System.out.println("Status: " + this.getStatus());

	}
}
