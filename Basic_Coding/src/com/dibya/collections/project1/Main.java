package com.dibya.collections.project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		int count = 0 ;
		
		while(true){
			
			if(count != 0) {
				
				System.out.println("\n\nDo you want to continue ? Yes : No");
				String continues = scan.next();
				if (continues.equalsIgnoreCase("Yes")) {
					
				}else {
					System.exit(0);
				}
				
							
				
			}
			count ++ ;
			
		System.out.println("\n\tStudent Project Management");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1.Add Student\n"
				+ "2.Update Student\n"
				+ "3.Display All Student\n"
				+ "4.Delete Student\n"
				+ "5.Exit");
		System.out.println("\nPlease Select Operation");  
		
		int option = scan.nextInt();

		switch(option){
		case 1 :
			Student s =studentUtility.addStudent();
			studentList.add(s);
			System.out.println("\nNew Student Added");
			break;
			
		case 2 :
			System.out.println("\nPlease specify the sId of the respective student");
			int sId2 = scan.nextInt();
			System.out.println("\nPlease specify the change by correcsponding id \n"
					+ "\t1. Change Name\n"
					+ "\t2. Change Age");
			int changeId = scan.nextInt();
			
			switch(changeId) {
			case 1 : 
				System.out.println("Please provide new name");
				String changedName=scan.next();
				studentUtility.updateStudent(studentList, sId2, changedName);
				break;
			case 2 : 	
				System.out.println("Please provide new Age");
				int changedAge=scan.nextInt();
				studentUtility.updateStudent(studentList, sId2, changedAge);
				break;
			default :
				System.err.println("Please enter a valid option from Above");
				break;
			}
			break;
			
			
		case 3 :
			studentUtility.displayAllStudents(studentList);
			break ;
		case 4 :
			System.out.println("Please provide sId of the student");
			int sId = scan.nextInt();
			studentUtility.deleteStudent(studentList , sId);
			studentUtility.displayAllStudents(studentList);
			break;
		case 5 :
			System.exit(0);break;
		default :
			System.err.println("Please enter a valid option from Above");
		}
		}
		
		
		

	}

}
