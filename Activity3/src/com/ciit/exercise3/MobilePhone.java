package com.ciit.exercise3;

public class MobilePhone extends Phone {

		private String line;
		private String brand;
		
		public MobilePhone(String phoneNum, String line, String brand) {
			super(phoneNum);
			this.setLine(line);
			this.setBrand(brand);
		}

		public String getLine() {
			return line;
		}

		public void setLine(String line) {
			this.line = line;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}
		
		public void call(String phoneNumber) {
			if (this.isOn()) {
				System.out.println("Calling number " + phoneNumber + "...");
				} else {
				System.out.println("Phone/s are turned off, please turn on first");
				}
		}
		
		
		
		public void call(String phoneNumber, int minutes) {
			if (this.isOn()) {
				System.out.println("Calling number " + phoneNumber + " for " + minutes + " minutes...");
				} else {
				System.out.println("Phone/s are turned off, please turn on first");
				}
		}
		

	}
