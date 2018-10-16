package studentdatabseapp;

import java.util.Scanner;

public class student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentID;
	private String courses;
	private String tuitionBalance;
	private int costOfCourse = 600;
	
	// Constructor: prompt user to enter student's name and year
	public void Student() {
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1- Freshmen\n2- Sophmore\n3- Junior\n4- Senior\n Enter student class lvel: ");
		this.gradeYear = in.nextInt();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear);
		
	}
	
	//Generate ID
	
	// Enroll in courses
	
	//View balance
	
	//Pay Tuition
	
	//Show Status

}
