package com.dibya.interview_prep;

import java.util.Collections;

/*
 * 1. Write a Java program to append the specified element to the end of a linked list.
 *
 * 2. Write a Java program to iterate through all elements in a linked list starting at the specified position.
 * 
 * 3. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
 * 
 * 4. Write a Java program that swaps two elements in a linked list.
 * 
 */

import java.util.LinkedList;

public class linkedList {
	
	public static void main(String args[]) {
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(3);
		
		/*
		 * for(int i : ll) {
			System.out.println(i);
		}*/
		
		/* 2
		 * for( int i=2 ; i < ll.size() ; i++) {
			System.out.println(ll.get(i) );
		}
		 * 
		 */
		
		/*
		Collections.reverse(ll);
		System.out.println(ll);
		*/
		
		/*
		System.out.println(ll.indexOf(3));
		System.out.println(ll.lastIndexOf(3));
		*/
		
		/*
		 * 4
		swap(ll, 0 , 1);
		System.out.println(ll);
		*/
		
		LinkedList<Integer> ll2 = new LinkedList<>();
		ll.add(6);
		ll.add(7);
		ll.add(8);
		ll.add(9);
		 ll.addAll(ll2);
		System.out.println(ll);
		
		
		
		
		
		
		
	}

	private static void swap(LinkedList<Integer> ll, int i, int j) {
		
		int e1 = ll.get(i);
		int e2 = ll.get(j);
		
		int tmp = e2 ;
		e2 = e1 ;
		e1 = tmp;
		ll.set(i, e1);
		ll.set(j, e2);  
		
		System.out.println(e1);
		System.out.println(e2);
		
	}

}
