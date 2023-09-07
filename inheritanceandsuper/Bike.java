package com.bptn.course.week2.inheritanceandsuper;

public class Bike extends Vehicle {
	String bikeHandle;

	public Bike(String colour, String brand, String bikeHandle) {
		super(colour, brand);
		this.bikeHandle = bikeHandle;
	}

	public void print() {
		// fill in the code
		super.print();
	}

}