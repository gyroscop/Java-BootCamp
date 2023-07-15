package com.dibya.generics;

import java.util.Arrays;

//import java.util.ArrayList;

public class ArrayList_Clone {

	private int[] data;
	private int size = 0;
	private static int DEFAULT_SIZE = 2;

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

		for (int i = 0; i <= data.length - 1; i++) {
			temp[i] = data[i];
		}

		data = temp;
	}

	private boolean isFull() {

		return size == data.length;
	}

	private int get(int index) {

		return data[index];
	}

	private int set(int index, int value) {

		data[index] = value;
		return data[index];
	}

	private int remove() {

		int removed = data[--size];
		return removed;
	}

	public int length() {
		return size;
	}

	@Override
	public String toString() {
		return Arrays.toString(data);
	}

	public static void main(String args[]) {

//		ArrayList<String> list = new ArrayList<String>();
//		list.add("Dibya");
//		list.add("Anupol");
//
//		System.out.print(list.toString());

		ArrayList_Clone arr = new ArrayList_Clone();
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println(arr);

	}

}
