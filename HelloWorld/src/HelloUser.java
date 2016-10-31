import java.util.Scanner;

public class HelloUser {
	String first_name;
	
	public HelloUser(){
		
	}
	
	public String greetUser() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name:");
		 first_name = input.next( );
		return first_name;
	}
}
