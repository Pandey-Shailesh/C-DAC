package Basic;

import java.util.Scanner;

public class SumOfAngle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the First angle ");
		int angle1 = input.nextInt();
		System.out.print("Enter the Second angle ");
		int angle2 = input.nextInt();
		System.out.print("Enter the Third angle ");
		int angle3 = input.nextInt();
		int sum = angle1 + angle2 + angle3;
		if (sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
			System.out.println("It is the Triangle.");
			if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
				System.out.println("It is Acute Angle triangle");
			} 
			else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
				System.out.println("It is Right Angle triangle");
			} 
			else {
				System.out.println("It is Obtuse Angle triangle");
			}
		} 
		else {
			System.out.println("It is not possible to form a triangle.!!!!!!!");
		}

		input.close();
	}

}
