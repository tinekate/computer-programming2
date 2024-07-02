package com.ciit.exercise1;

public class Program {
	public static void main(String[]args) {
		
		//display title
		System.out.println("Displaying Attributes of Car A and Car B");
		System.out.println();

		Car carA = new Car();
		Car carB = new Car();
		
		carB.plate = ("DBA 0615");
		carB.sprayPaint("Pink");
		carB.model = ("GR86");

		Engine sampleEngine = new Engine();
		Engine sampleEngineB = new Engine();

		sampleEngine.setBrand("Nissan");
		sampleEngineB.setBrand("Toyota");

		carA.engine = sampleEngine;
		carB.engine = sampleEngineB;

		carB.carEngine = ("2.4L Flat-four Boxer");

		System.out.println("Attributes of Car A");
	
		System.out.println("Car: " + carA.plate);
		System.out.println("Brand: " + carA.engine.brand);
		System.out.println("Model: " + carA.color + " " + carA.model);
		System.out.println("Engine: " + carA.carEngine );
		
		System.out.println();

		System.out.println("Attributes of Car B");
		System.out.println("Car: " + carB.plate);
		System.out.println("Brand: " + carB.engine.brand);
		System.out.println("Model: " + carB.color + " " + carB.model );
		System.out.println("Engine: " + carB.carEngine );

		}

}