package com.dibya.interfaces;

//import com.dibya.abstract_class.Car;

public class Main {

	public static void main(String[] args) {

		Car Audi = new Car("Audi");

		String Model = Audi.Model("R8");
		Integer Power = Audi.power(1000);
		Integer Torque = Audi.torque(500);
		String Manufacturer = Audi.EngineManufacturer("Audi");
		String Brand_Manufacturer = Audi.Brand_Manufacturer("Toyota");

		System.out.println(Audi.toString() + " " + Model + " " + Power + " " + " " + Torque + " " + Brand_Manufacturer);

	}

}
