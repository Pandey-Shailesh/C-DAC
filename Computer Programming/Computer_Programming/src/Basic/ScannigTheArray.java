package Basic;

import java.util.Scanner;

public class ScannigTheArray {
	public static void main(String[] args) {
//		WAP to find  an element in an array
		Scanner input = new Scanner(System.in);
		int length;
		int position = 0;
		System.out.print("Enter the length of array:");
		length = input.nextInt();
		int array[] = new int[length];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter the values " + (i + 1) + " in array: ");
			array[i] = input.nextInt();
		}
		System.out.print("Give the number you want to search :");
		int search = input.nextInt();
		for (int i = 0; i < array.length; i++) {

			if (search == array[i]) {
				position = i + 1;
				break;
			}
		}
		if (position == 0) {
			System.out.println("it is not present..");
		} else {
			System.out.println("it is preasent at position: " + position);
		}

		input.close();
	}

}
