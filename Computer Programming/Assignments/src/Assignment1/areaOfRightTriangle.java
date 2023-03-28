package Assignment1;

import java.util.Scanner;

public class areaOfRightTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the height numbers: ");
		double height = input.nextInt();
		System.out.print("Enter the base numbers: ");
		double base = input.nextInt();

		double area = 0.5 * height * base;
		System.out.println("The area of right angle triangle is :" + area);
		
		input.close();
	}
}
