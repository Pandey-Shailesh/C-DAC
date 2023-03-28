package Basic;

import java.util.Scanner;

public class CopyArrayInAnotherArray {
	public static void main(String[] args) {
		//WAP to copy one array elements into another array
		Scanner input = new Scanner(System.in);
		int length;
		System.out.print("Enter the length of array:");
		length = input.nextInt();
		int array[] = new int[length];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter the values " + (i + 1) + " in array: ");
			array[i] = input.nextInt();
		}
//		int anotherArray[] = new int[array.length];
//		for (int i = 0; i < array.length; i++) {
//			anotherArray[i] = array[i];
//		}
		int anotherArray[]=array;
		for (int i = 0; i < anotherArray.length; i++) {
			System.out.print(anotherArray[i] + " ");
		}
		input.close();
	}
}
