package Basic;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		float result = 0.0F;
		int i = 1;
		float out = 1;
		// Calculator Menu
		System.out.println("\nCalculator Menu:" + "\n1.Addition\n2.Subtraction\n3.Multiplication"
				+ "\n4.Division\n5.Power\n6.Exit");

		// enter the choice
		System.out.print("Enter your choice: ");
		char choice = input.next().charAt(0);

		// implementing switch case
		switch (choice) {
		case '1':
			System.out.print("Enter the number:  " + i + ": ");
			float num1 = input.nextFloat(); // 10
			while (num1 != 0) {
				result = result + num1;
				i++;
				System.out.print("Enter the number:  " + i + ": ");
				num1 = input.nextFloat();
			}
			System.out.println("Result = " + result);
			break;

		case '2':
			System.out.print("Enter the number:  " + i + ": ");
			float num2 = input.nextFloat(); // 10
			while (num2 != 0) {
				result = num2 - result;
				i++;
				System.out.print("Enter the number:  " + i + ": ");
				num2 = input.nextFloat();

			}
			System.out.println("Result = " + result);
			break;

		case '3':
			System.out.print("Enter the number:  " + i + ": ");
			float num3 = input.nextFloat(); // 10
			while (num3 != 1) {
				out = num3 * out;
				i++;
				System.out.print("Enter the number:  " + i + ": ");
				num3 = input.nextFloat();

			}
			System.out.println("Result = " + out);
			break;

		case '4':
			System.out.print("Enter the number:  " + i + ": ");
			float num4 = input.nextFloat(); // 10
			while (num4 != 1) {
				out = num4 / out;
				i++;
				System.out.print("Enter the number:  " + i + ": ");
				num4 = input.nextFloat();

			}
			System.out.println("Result = " + out);
			break;

		case '6':
			System.exit(0);
			break;

		default:
			System.out.println("please enter the correct choice");
			break;

		}
		System.out.println("/nDo you want to contine (Y/N):");
		choice = input.next().charAt(0);
		input.close();
	}
}
