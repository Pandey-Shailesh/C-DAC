package Basic;

import java.util.Scanner;

public class AreaOfRectangle {
	Scanner scan = new Scanner(System.in);

	int length, breadth, area;

	public void AreaofRectangle() {
		System.out.print("Enter the length of Rectangle in cm: ");
		length = scan.nextInt();

		System.out.print("Enter the breadth of Rectangle in cm: ");
		breadth = scan.nextInt();
		area = length * breadth;
		System.out.println("Area of Rectangle = " + area + " square cm");
	}

	public static void main(String[] args) {

		// System.out.println("Main method starts executing!!!!!!!!");

		AreaOfRectangle rect = new AreaOfRectangle();

		rect.AreaofRectangle();

	}
}
