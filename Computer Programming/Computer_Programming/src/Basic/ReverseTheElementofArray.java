package Basic;


import java.util.Scanner;

public class ReverseTheElementofArray {
	public static void main(String[] args) {
		// WAP to reverse an array elements
		Scanner input = new Scanner(System.in);
		int length;
		System.out.print("Enter the length of array:");
		length = input.nextInt();
		int array[] = new int[length];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter the values " + (i + 1) + " in array: ");
			array[i] = input.nextInt();
		}
		System.out.println("befor reversing the array..");
		for (int i = 0; i < array.length; i++) {
			System.out.print("[ " + array[i] + " ]");
		}
		int variable;
		for (int i = 0; i <= array.length / 2; i++) {
			variable = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = variable;
		}
		System.out.println("\nAfter reverseing the array...");
		for (int i = 0; i < array.length; i++) {
			System.out.print("[ " + array[i] + " ]");
		}
		input.close();
	}
}
