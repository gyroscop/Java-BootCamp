package com.dibya.staticExamples;

public class Main {

	public static void main(String[] args) {

		Human Kunal = new Human(25, "Kunal");

		Human Dibya = new Human(23, "Dibya");

//		System.out.println("Kunal Count " + Kunal.count);
//		System.out.println("Dibya Count " + Dibya.count);
//
//		System.out.println("Human Population " + Kunal.population);
//		System.out.println("Human Population " + Dibya.population);

		Main main = new Main();
//		main.greeting(Dibya);

		StaticBlock obj1 = new StaticBlock();
		System.out.println(obj1.a + " " + obj1.b + " obj1 : count : " + StaticBlock.count);

		obj1.b += 3;

		StaticBlock obj2 = new StaticBlock();

		System.out.println(obj2.a + " " + obj2.b + " obj2 : count : " + StaticBlock.count);
	}

//	public static void greeting(String name) {
//		System.out.println("Hi " + name + ", Welcome to eclipse");
//	}

	public void greeting(Human person) {
		System.out.println("Hi " + person.name + ", Welcome to eclipse");

	}

}
