package com.dibya.oop;

public class Car {

	String brand;
	String model;
	String color;

	/// Type 1
	Car() {
		this.brand = "Unknown";
		this.model = "Unknown";
		this.color = "Unknown";

	}

	/// Type 2
//	Car(String prop1, String prop2, String prop3) {
//		brand = prop1;
//		model = prop2;
//		color = prop3;
//
//	}

	/// Type 3
	Car(String brand, String model, String color) {
		this.brand = brand;
		this.model = model;
		this.color = color;

	}

	Car(String brand, String model) {
		this.brand = brand;
		this.model = model;

	}

	void Greet() {
		System.out.println("The anytique " + color + " " + brand + " " + model);
	}

	void old_Owner(Car owner) {
		this.brand = owner.brand;
		this.model = owner.model;
		this.color = owner.color;

	}

}

/*
 * Note : Type 1 and Type 3 can exist at the same time, this is known as
 * constructor overloading
 */
