package emailapp;
import java.util.Scanner;
public class EmailApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type your first name: ");
		String firstName = sc.nextLine();
		System.out.println("Type your last name: ");
		String lastName = sc.nextLine();
		
		Email em = new Email(firstName, lastName);
		System.out.println(em.showInfo());
		
		sc.close();

	}

}
