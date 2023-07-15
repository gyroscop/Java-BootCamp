package com.dibya.generics;

//import java.util.ArrayList;

public class ArrayList_Clone {

	private int[] data;
	private static int DEFAULT_SIZE = 5;
	private int size = 0;

	public ArrayList_Clone() {

		this.data = new int[DEFAULT_SIZE];
	}

	public void add(int num) {

		if (isFull()) {
			resize();
		}

		data[size++] = num;
	}

	private void resize() {

		int[] temp = new int[data.length * 2];
//		copy current items in new array

		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}

		data = temp;
	}

	private boolean isFull() {

		return size == data.length;
	}

	public static void main(String[] args) {

		ArrayList_Clone newarr = new ArrayList_Clone();
		newarr.add(3);

	}

}
