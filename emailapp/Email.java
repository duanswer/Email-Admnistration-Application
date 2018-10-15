package emailapp;
import java.util.Scanner;
public class Email {
	Scanner sc = new Scanner(System.in);
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 50;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySiffix = "aeycompany.com";
	
	// Constructor to receive the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created: " + this.firstName + " " +  this.lastName);
		
		// Call a method asking for the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySiffix;
		//System.out.println("Your mail is: " + email);
		
	}
		
	// Ask for the department
	private String setDepartment() {
		System.out.print("New worker: " + firstName + ". Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter depatment code: ");
		int departmentChoice = sc.nextInt();
		if(departmentChoice == 1) {return "Sales";}
		else if(departmentChoice == 2) {return "dev";}
		else if(departmentChoice == 3) {return "acct";}
		else {return "";}
		
		
	}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int) (Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	
	// Set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
		
	}
	
	// Change the password
	public void ChangePassword(String pawword) {
		this.password = password;

	}
	
	public int getMailBoxCapacity() {return mailBoxCapacity;}
	public String alternateEmail() {return alternateEmail;}
	public String getPasword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " +lastName + 
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";
	}

}
