package oop_classes_and_objects;

import java.util.Random;

public class Student {

	String name;
	String standard;
	int rollno;

	static Random random = new Random();

	public Student() {
		this("Undefined Name", "Undefined Standard", random.nextInt());
	}

	public Student(String name, String standard, int rollno) {

		this.name = name;
		this.standard = standard;
		this.rollno = rollno;

	}

}
