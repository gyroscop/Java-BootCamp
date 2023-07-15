package com.dibya.abstract_class;

public class Main {

	public static void main(String[] args) {

		Car Audi = new Car("Audi");

		String Model = Audi.Model("R8");
		Integer Power = Audi.Power(1000);
		Integer Torque = Audi.Torque(500);

		System.out.println(Audi.toString() + " " + Model + " " + Power + " " + " " + Torque);

	}

}
