package Assignment1;

import java.util.Scanner;

public class printYourFullName {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the your full name: ");

		String name = input.nextLine();
		
		
		System.out.print("Enter the your Grade: ");
		char grade = input.next().charAt(0);
		
		System.out.println("My full name is : " + name +" and my Garde is " +grade +".");
		
		input.close();
	}

}
