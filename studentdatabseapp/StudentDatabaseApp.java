package studentdatabseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
				
		// Ask how many new users we want to add
		System.out.print("Enter number of students to enroll: ");
		Scanner in  = new Scanner(System.in);
		int numberOfStudents = in.nextInt();
		student[] students = new student[numberOfStudents];
		
		// Create n number of new students			
		for(int i = 0; i<numberOfStudents; i++) {
			students[i] = new student();		
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].toString());
		}
		
		in.close();
	}

}