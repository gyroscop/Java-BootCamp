package com.dibya.interview_prep;


/*
 * 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
 * 
 * 2. Write a Java program to iterate through all elements in an array list.
 * 
 * 3. Write a Java program to insert an element into the array list at the first position.
 * 
 * 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
 * 
 * 5. Write a Java program to update an array element by the given element.
 * 
 * 6. Write a Java program to remove the third element from an array list.
 * 
 * 7. Write a Java program to search for an element in an array list.
 * 
 * 8. Write a Java program to shuffle elements in an array list.
 * 
 * 9. Write a Java program to reverse elements in an array list.
 * 
 * 10 . Write a Java program to extract a portion of an array list.
 * 
 * 11 . Write a Java program to compare two array lists.
 * 
 * 12. Write a Java program to replace the second element of an ArrayList with the specified element.
 * 
 * 13 . Write a Java program to print all the elements of an ArrayList using the elements' position.
 */



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayList {

	public static void main(String args[]) {

		ArrayList<String> arrayList = new ArrayList<>(2);
		arrayList.add("Red");
		arrayList.add("Blue");
		arrayList.add("Green");
//		arrayList.addAll(arrayList);

		/* 1. System.out.println(arrayList); */

		/*
		 * 2. for (String string : arrayList) { System.out.println(string); }
		 * 
		 */

		/*
		 * 3. arrayList.add(0, "Orange"); System.out.println(arrayList);
		 * 
		 */

		/*
		 * 4 System.out.println(arrayList.get(2));
		 * 
		 */

		/*
		 * 
		 * 
		 * arrayList.set(0, "Violet");
		 * 
		 * System.out.println(arrayList);
		 */

		/*
		 * 6. arrayList.remove(2); System.out.println(arrayList);
		 * 
		 */

		/*
		 * 7. System.out.println(arrayList.contains("Red"));
		 * System.out.println(arrayList.indexOf("Blue"));
		 */

		/*
		 * 8
		 * Collections.shuffle(arrayList);
			System.out.println(arrayList);
		
		 */
		
		/*
		 * 
		 * 9. Collections.reverse(arrayList);
		System.out.println(arrayList);
		
		*/
		
		/*
		 *10 
		 * List<String> sub_list = arrayList.subList(0, 2);
		 System.out.print(sub_list);
		 */
		
		/*
		 * 11 
		 * 
		 * ArrayList<String> arrayList2  = new ArrayList<String>();
		arrayList2.add("Green");
		arrayList2.add("Blue");
		ArrayList<String> compare_list = new ArrayList<String>();;
		for(String e  :  arrayList) {
			 compare_list.add(arrayList2.contains(e)? "Yes" : "No"); 
		}
		
		 
		System.out.print(compare_list);
		
		 */

		/*
		 * 12
		 * arrayList.set(0, "Orange");
		 * System.out.print(arrayList);
		 */
		
		/*
		 * 13 
		 * for ( int i = 0 ; i < arrayList.size()  ;  i ++) {
			System.out.println(arrayList.get(i));
		}
		 */
		
		
		

	}

}

