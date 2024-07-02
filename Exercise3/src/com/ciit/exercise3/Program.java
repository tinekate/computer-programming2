package com.ciit.exercise3;

public class Program {

	public static void main(String[] args) {
		
		//mobile brands
		Brand brand1 = new Brand("Apple");
		Brand brand2 = new Brand("Samsung");
		Brand brand3 = new Brand("Asus");
		
		//mobile sim cards
		SimCard sim1 = new SimCard("03952874000", "Smart");
		SimCard sim2 = new SimCard("09242068300", "Globe");
		SimCard sim3 = new SimCard("09127737199", "Smart");
		
		//mobile phones info
		MobilePhone phone1 = new MobilePhone(sim1,brand1, "iPhone 13 Pro Max", false);
		MobilePhone phone2 = new MobilePhone(sim2,brand2, "Samsung Galaxy S10+", false);
		MobilePhone phone3 = new MobilePhone(sim3,brand3, "ROG Phone 5s Pro", false);
		
		//displaying info
		System.out.println("Mobile Phone 1 info");
		phone1.display();
		System.out.println("\nMobile Phone 2 info");
		phone2.display();
		System.out.println("\nMobile Phone 3 info");
		phone3.display();
		
		//for swapping
		phone1.swapSimCards(phone2);
		phone3.swapSimCards(phone2);
		
		
		//call while off
		System.out.println("\n"+ phone1.modelName + " is calling " + phone2.modelName);
		phone1.callMeMaybe(phone2);
		
		//turning on phones
		System.out.println();
		phone1.togglePhone();
		phone2.togglePhone();
		phone3.togglePhone();
		
		//now that phones are turned on, display info + swap
		System.out.println("\nPhone 1 info");
		phone1.display();
		System.out.println("\nPhone 2 info");
		phone2.display();
		System.out.println("\nPhone 3 info");
		phone3.display();
		
		//call while on
		System.out.println("\n"+ phone1.modelName + " is calling " + phone2.modelName);
		phone1.callMeMaybe(phone2);
		
		//turning on phones
		System.out.println();
		phone1.togglePhone();
		phone2.togglePhone();
		phone3.togglePhone();
	
		}	
}
