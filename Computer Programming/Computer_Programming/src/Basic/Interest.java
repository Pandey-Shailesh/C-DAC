package Basic;

import java.util.Scanner;

public class Interest {
	Scanner input = new Scanner(System.in);
	double principal = 0.0;
	double rate = 0.0;
	double time = 0.0;
	int num = 0;

	public void SI() {

		System.out.print("Enter the amount:  ");
		principal = input.nextDouble();

		System.out.print("Enter the rate:  ");
		rate = input.nextDouble();

		System.out.print("Enter the time:  ");
		time = input.nextDouble();

		// calculate the simple interest
		double simpleIntrest = (principal * rate * time) / 100;

		// display the result

		System.out.println("Total interest = " + simpleIntrest);
	}

	public void CI() {

		System.out.print("Enter the amount:  ");
		principal = input.nextDouble();

		System.out.print("Enter the rate:  ");
		rate = input.nextDouble();
		rate = rate / 100;

		System.out.print("Enter the time:  ");
		time = input.nextDouble();

		System.out.print("Enter the  times interest compounded per year:  ");
		num = input.nextInt();
		// calculate the simple interest
		double compoundInterestI = principal * (Math.pow((1 + rate / num), (num * time))) - principal;
		// display the result
		System.out.println(compoundInterestI);
	}

	public static void main(String[] args) {

		Interest interest1 = new Interest();
		interest1.CI();
		interest1.SI();

		interest1.input.close();
	}
}