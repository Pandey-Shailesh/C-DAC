package Assignment1;

import java.util.Scanner;

public class calculateMarks {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Maths, Science and English marks Respectively:");
		double maths = input.nextInt();
		double science = input.nextInt();
		double english = input.nextInt();
		double totalMarks = maths + science + english;
		double avg = totalMarks / 3;
		double percent = avg * 100;
		System.out.println("the total marks is:" + totalMarks);
		System.out.println("the  avgerage is:" + avg);
		System.out.println("the total percent is:" + percent);

		input.close();
	}

}
