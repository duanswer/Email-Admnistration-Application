package studentdatabseapp;

import java.util.Scanner;

public class student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public student() {
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1- Freshmen\n2- Sophmore\n3- Junior\n4- Senior\n Enter student class lvel: ");
		this.gradeYear = in.nextInt();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear);
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);		
			
	}
	
	// Generate ID
	private void setStudentID() {
		// Grade level + ID
		id++;
		this.studentID =  gradeYear + "" + id;
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (0 to quit): ");
			Scanner in  = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;
			}
		}while(1 != 0);
		
		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
		
	}
	
	// View balance
	 
	// Pay Tuition
	
	// Show Status

}
