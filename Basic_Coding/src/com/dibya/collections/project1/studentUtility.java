package com.dibya.collections.project1;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class studentUtility {
	
	
	
	// 1. Add Student
	
	public static Student addStudent()
	{
		Scanner scan =  new Scanner(System.in);
		Student s = new Student();
		System.out.println("Please provide the sid of the Student");
		s.setsId(scan.nextInt());
		System.out.println("Please provide the name of the Student");
		s.setName(scan.next());
		System.out.println("Please provide the age of the Student");
		s.setAge(scan.nextInt());
		
		
		return s ;
		
		
	}
	// 2. Update Student
	
	public static void updateStudent(List<Student> students , int sId , String changedName) {
		

		
		for (Student S : students) {
			if( S.getsId() == sId ) {
				S.setName(changedName);
				
				}
			System.out.print(S.toString());
		}
	}
	
	public static String updateStudent(List<Student> students , int sId , int changedAge) {
		

		for (Student S : students) {
		if( S.getsId() == sId ) {
			S.setAge(changedAge);
			System.out.print(S.toString());
			}
		
	}
		return null;
		
		
		
	}
	
	// 3. Display Student
	
	public static String display_student(Student s) {
		
		return s.toString();
		
	}
	
	public static void displayAllStudents(List<Student> students) {
		
		Iterator<Student> studentIterator = students.iterator();
		
		while(studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
		}
	}
	
	
	// 4. Delete Student
	
	public static void deleteStudent(List<Student> studentList, int sId) {
 
//		for (Student S : studentList) {
//			if( S.getsId() == sId ) {
//				
//				int removeId = studentList.indexOf(S);
//				studentList.remove(sId);
//				
//				
//			}
//		}
		
		Iterator<Student> studentIterator = studentList.iterator();
		
		while(studentIterator.hasNext()) {
			if(studentIterator.next().getsId() == sId) {
				studentIterator.remove();
			}
		}
		
		
	}
	


}
