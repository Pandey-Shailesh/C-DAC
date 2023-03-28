package Assignment3;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String args[]) {
		int marks[] = new int[5];
		float total = 0, avg;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < marks.length; i++) {
			System.out.print("Enter Marks of Subject " + (i + 1) + " : ");
			marks[i] = scanner.nextInt();
			total = total + marks[i];
		}
		System.out.println("total marks = "+total);
		avg = total / marks.length;
		System.out.println("Average: " + avg);
		System.out.print("The student Grade is: ");
		if (avg >= 85) {
			System.out.print("A Grade");
		} else if (avg < 85 && avg >= 60) {
			System.out.print("B Grade");
		} else if (avg < 60 && avg >= 40) {
			System.out.print("C Grade");
		} else {
			System.out.print("D Grade");
		}
		scanner.close();
	}
}
