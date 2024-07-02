package com.ciit.exercise3;

	public class Program {

		public static void main(String[] args) {
			
			//Creating new smart phones
			SmartPhone sp1 = new SmartPhone("09122068300", "Globe", "Samsung", 5);
			SmartPhone sp2 = new SmartPhone("09313876590", "Smart", "Asus", 3);
			
			//creating new mobile phones
			MobilePhone mp1 = new MobilePhone("09458763670", "Globe", "Blackberry");
			MobilePhone mp2 = new MobilePhone("09324098702", "Smart", "Nokia");
			
			
			//displaying info of all phones
			System.out.println("Mobile Phone 1 information");
			System.out.println("Phone brand: " + mp1.getBrand());
			System.out.println("Phone line: " + mp1.getLine());
			System.out.println("Phone number: " + mp1.getPhoneNum());
			System.out.println("Is Phone on: " + mp1.isOn());
			System.out.println();
			System.out.println("Mobile Phone 2 information");
			System.out.println("Phone brand: " + mp2.getBrand());
			System.out.println("Phone line: " + mp2.getLine());
			System.out.println("Phone number: " + mp2.getPhoneNum());
			System.out.println("Is Phone on: " + mp2.isOn());
			System.out.println();
			System.out.println();
			System.out.println("Smart Phone 1 information");
			System.out.println("Phone brand: " + sp1.getBrand());
			System.out.println("Phone CPU #: " + sp1.getNumOfCPU());
			System.out.println("Phone line: " + sp1.getLine());
			System.out.println("Phone number: " + sp1.getPhoneNum());
			System.out.println("Is Phone on: " + sp1.isOn());
			System.out.println();
			System.out.println("Smart Phone 2 information");
			System.out.println("Phone brand: " + sp2.getBrand());
			System.out.println("Phone CPU #: " + sp2.getNumOfCPU());
			System.out.println("Phone line: " + sp2.getLine());
			System.out.println("Phone number: " + sp2.getPhoneNum());
			System.out.println("Is Phone on: " + sp2.isOn());
			System.out.println();
			
			//using call method
			System.out.println("Trying to call Mobile Phone 2 using Mobile Phone 1...");
			mp1.call(mp2.getPhoneNum());
			System.out.println();
			System.out.println("Trying to call Smart Phone 2 using Smart Phone 1...");
			//using overridden call method
			sp1.call(sp2.getPhoneNum());
			//using overloaded call method
			System.out.println();
			System.out.println("Trying to call Smart Phone 1 using Mobile Phone 1 for 5 minutes...");
			mp1.call(sp1.getPhoneNum(),5);
			
			System.out.println();
			System.out.println("Turning on all phones...");
			mp1.setOn(true);
			mp2.setOn(true);
			sp1.setOn(true);
			sp2.setOn(true);
			System.out.println();

			//using call method
			System.out.println("Trying to call Mobile Phone 2 using Mobile Phone 1...");
			mp1.call(mp2.getPhoneNum());
			System.out.println();
			//using overridden call method
			System.out.println("Trying to call Smart Phone 2 using Smart Phone 1...");
			sp1.call(sp2.getPhoneNum());
			//using overloaded call method
			System.out.println();
			System.out.println("Trying to call Smart Phone 1 using Mobile Phone 1 for 5 minutes...");
			mp1.call(sp1.getPhoneNum(),5);
		}

	}
