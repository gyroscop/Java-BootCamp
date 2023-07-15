package com.dibya.staticExamples;

public class Human {

	int age;
	String name;
	int count;
	static long population;

	public Human(int age, String name) {

		this.age = age;
		this.name = name;
		this.count += 1;
		Human.population += 1;
	}

}
