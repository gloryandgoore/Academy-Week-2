package com.bptn.course.week2.inheritanceandsuper;

public class Vehicle {

    // add parameterized constructor
    String colour;
	String brand;


	public Vehicle(String colour, String brand) {
	    this.colour = colour;
	    this.brand = brand;
	}

    Vehicle() {
       this("Black", "Tesla");
   }
   
    public void print() {
        System.out.println(this.colour + " " + this.brand);
    }
    
    public static void main(String[] args) {
       Car car = new Car("White", "Audi", "Chromecoloured");
       Bike bike = new Bike("Grey", "BMW", "Silvercoloured");
       car.print();
       bike.print();

   }

}


