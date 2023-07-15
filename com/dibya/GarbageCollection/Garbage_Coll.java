package com.dibya.GarbageCollection;

public class Garbage_Coll {

	public static void main(String[] args) {

		GC newgc;

		for (int i = 0; i < 1000000; i++) {
			newgc = new GC("Dibya GC");

			System.out.println("New Object Created");
		}
	}

}

class GC {

	String str;

	public GC(String str) {

		this.str = str;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Destroyed");

	}

}
