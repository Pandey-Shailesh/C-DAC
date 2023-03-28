package Assignment1;

import java.util.Scanner;

public class averageOfFiveNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Five numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		int sum = num1 + num2 + num3 + num4 + num5;
		int average = (sum) / 5;
		System.out.println("The Average of Five Numbers is:" + average);
		
		input.close();
	}
}
