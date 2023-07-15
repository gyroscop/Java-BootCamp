package com.dibya.staticExamples;

public class StaticBlock {

	static int a = 6;
	static int b = a * 5;;
	static int count;

	static {
		System.out.println("I am inside static block");
		b = a * 5;
		count = 0;
	}

	public StaticBlock() {
		count += 1;
	}

}
