package Basic;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		// create an object for the Scanner class
		Scanner input = new Scanner(System.in);

		// declare the variable
		double amount = 0.0;
		double rate = 0.0;
		double time = 0.0;

		// reading the inputs from the keyboard

		System.out.print("Enter the amount:  ");
		amount = input.nextDouble();

		System.out.print("Enter the rate:  ");
		rate = input.nextDouble();

		System.out.print("Enter the time:  ");
		time = input.nextDouble();

		// calculate the simple interest
		double SI = (amount * rate * time) / 100;

		// display the result

		System.out.println("Total interest = " + SI);

		input.close();

		// ================================
//	//Write a java program to calculate the Simple Interest
//	double SI, amount=234.56,rate=7.5, time =3.5;
//
//	
//	SI=(amount*rate*time)/100;
//	System.out.println(SI);
//	
	}
}
