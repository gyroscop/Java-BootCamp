package oop_classes_and_objects;

public class Main {

	public static void main(String[] args) {

//		This package collection will grief the base understanding of a class and its objects

//		Student Dibya = new Student(); ---case 1  (No arguments)

		Student Dibya = new Student("Dibya Jyoti Sarmah", "9th", 1);

		System.out.print(Dibya.name + " " + Dibya.standard + " " + Dibya.rollno);
	}

}
