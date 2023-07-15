package com.dibya.staticExamples;

public class innerClass {

	static class Test {

		String name;

		public Test(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Test [name=" + name + "]";
		}

	}

	public static void main(String[] args) {

		Test a = new Test("Kunal");
		Test b = new Test("Dibya");

//		System.out.println(a.name);
//		System.out.println(b.name);

		System.out.println(a);
	}

}
