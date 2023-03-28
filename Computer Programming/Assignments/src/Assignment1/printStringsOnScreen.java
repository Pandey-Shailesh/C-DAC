package Assignment1;

import java.util.Scanner;

public class printStringsOnScreen {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the your Course details: ");
		System.out.print("Enter the your Course name: ");
		String course = input.nextLine();
		System.out.print("Enter the your Full Form Of Course name : ");
		String fullFormOfCourse = input.nextLine();
		System.out.print("Enter the your Center name: ");
		String center = input.nextLine();

		System.out.println(course);//"C-DAC";
		System.out.println(fullFormOfCourse);//"CENTRE FOR DEVELOPMENT OF ADVANCED COMPUTING";
		System.out.println(center);//" ACTS C-DAC DELHI";
		
		input.close();

	}
}
