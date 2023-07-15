package com.dibya.access_modifiers;

import java.util.ArrayList;

public class Main {

	public static <E> void main(String[] args) {

		User dibyaUser = new User("Dibya", 1);

		Access acc = new Access(dibyaUser);
		System.out.println(acc.setDefaultPass("69"));

		ArrayList<E> Arr = new ArrayList<>();

		Integer a = new Integer(3);
		// Arr.DEFAULT_CAPACITY ;
	}

}
