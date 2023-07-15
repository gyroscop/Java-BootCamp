package com.dibya.objects;

public class ObjectDemo {

	private int Number;

	public ObjectDemo(int Number) {
		this.Number = Number;
	}

	@Override
	public boolean equals(Object obj) {

		return this.Number == ((ObjectDemo) obj).Number;
	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

	public static void main(String[] args) {

		ObjectDemo obj1 = new ObjectDemo(20);

		ObjectDemo obj2 = new ObjectDemo(30);

		// System.out.println(obj1.equals(obj2));

		// System.out.println(obj1 instanceof Object);

		System.out.println(obj1.getClass().getSimpleName());
	}

}
