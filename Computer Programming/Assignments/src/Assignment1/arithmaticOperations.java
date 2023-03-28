package Assignment1;

import java.util.Scanner;

public class arithmaticOperations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Two numbers:");
		double num1 = input.nextInt();
		double num2 = input.nextInt();
		double addition = num1 + num2;
		double subtraction = num1 - num2;
		double multiplication = num1 * num2;
		double division = num1 / num2;
		double modules = num1 % num2;

		System.out.println("Addition is :" + addition);
		System.out.println("Subtraction is :" + subtraction);
		System.out.println("Multiplication is :" + multiplication);
		System.out.println("Division is :" + division);
		System.out.println("Modules is :" + modules);
		
		input.close();

	}
}
