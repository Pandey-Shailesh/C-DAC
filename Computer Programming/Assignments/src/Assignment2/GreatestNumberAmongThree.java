package Assignment2;

import java.util.Scanner;

public class GreatestNumberAmongThree {

	public static void main(String[] args) {
		int a, b, c, largest, temp;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number:");
		a = input.nextInt();
		System.out.println("Enter the second number:");
		b = input.nextInt();
		System.out.println("Enter the third number:");
		c = input.nextInt();

		if (a > b) {
			temp = a;
			System.out.println("a is greatest.");
		} else {
			temp = b;

		}

		if (c > temp) {
			largest = c;
			System.out.println("c is greatest.");
		} else {
			largest = temp;
			System.out.println("b is greatest.");
		}
		System.out.println("The largest number is: " + largest);
		input.close();
	}

}
