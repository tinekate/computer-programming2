package com.ciit.exercise3;

public class SmartPhone extends MobilePhone{
		private int numOfCPU;

		public SmartPhone(String phoneNum, String line, String brand, int numOfCPU) {
			super(phoneNum, line, brand);
			this.numOfCPU = numOfCPU;
		}

		public int getNumOfCPU() {
			return numOfCPU;
		}

		public void setNumOfCPU(int numOfCPU) {
			this.numOfCPU = numOfCPU;
		}
		
		@Override
		public void call(String phoneNumber) {
			if (this.isOn()) {
				System.out.println("Calling over internet...");
				System.out.println("Calling number " + phoneNumber + "...");
				} else {
				System.out.println("Phone/s are turned off, please turn on first");
				}
		}
		

	}