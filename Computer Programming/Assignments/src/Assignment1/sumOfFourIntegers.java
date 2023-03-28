package Assignment1;

import java.util.Scanner;

public class sumOfFourIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Four numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int sum = num1 + num2 + num3 + num4;
		System.out.println(sum);
		
		input.close();
	}
}
