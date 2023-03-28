package Basic;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// Write a java program to calculate the Compound Interest and take the desired
		// input from the keyboard
		Scanner input = new Scanner(System.in);
		double principal = 0.0;
		double rate = 0.0;
		double time = 0.0;
		int num = 0;

		System.out.print("Enter the amount:  ");
		principal = input.nextDouble();

		System.out.print("Enter the rate:  ");
		rate = input.nextDouble();
		rate = rate / 100;

		System.out.print("Enter the time:  ");
		time = input.nextDouble();

		System.out.print("Enter the  times interest compounded per year:  ");
		num = input.nextInt();

		double CI = principal * (Math.pow((1 + rate / num), (num * time))) - principal;

		// math.pow(base,power)
		// display the result

		System.out.println("Total interest = " + CI);

		input.close();

		// ==========================================
		// Write a java program to calculate the Compound Interest

//	double principal=299.73;
//	double interestrate=7.5;
//	double duration=3.00;
//	
//	 double CI = (principal *(Math.pow((1 + interestrate / 100), duration)))- principal;
//	 System.out.println("compound interest is :"+CI);

	}
}
