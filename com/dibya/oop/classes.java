package com.dibya.oop;

public class classes {

	public static void main(String[] args) {

		Car daddy_car = new Car("Maruti Suzuki", "Maroon", "Alto800");
		// System.out.print(daddy_car.brand + " " + daddy_car.model + " " +
		// daddy_car.color);

		Car dadu_car = new Car("Jeep", "Wrangler Rubicon");
		// System.out.print(dadu_car.brand + " " + dadu_car.model);

		Car John_car = new Car();
		John_car.old_Owner(dadu_car);
		/// System.out.print(John_car.brand + " " + John_car.model);

		/// **********Wrapper Classes**************///

		final int a;
		Integer b = new Integer(3);
		a = 11;

		// System.out.print(a);

		Person dibya = new Person("Dibya");
		// dibya.name = "kunal";

		dibya = new Person("Biswa");

		System.out.print(dibya.name);

	}

}

class Person {

	String name;

	public Person(String name) {

		this.name = name;
	}

}
