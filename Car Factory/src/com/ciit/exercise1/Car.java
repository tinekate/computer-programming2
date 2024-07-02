package com.ciit.exercise1;

public class Car {
	public String color = "Black";
	public Engine engine;
	public String plate = "GTR888";
	public String model = "R34GT-R";
	public String carEngine = "RB26DETT";

	
	public void sprayPaint(String color) {
		this.color = color;
	}
	
	public void plate(String plate) {
		this.plate = plate;
	}
	
	public void model(String model) {
		this.model = model;
	}
	
	public void engine(String engine) {
		this.carEngine = carEngine;
	}
	
	
}