package Assignment1;

import java.util.Scanner;

public class areaOfCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius numbers: ");
		double radius = input.nextInt();
		double area = Math.PI * radius * radius;
		System.out.println("the area of Circle is : " + area);
		
		input.close();
	}
}
