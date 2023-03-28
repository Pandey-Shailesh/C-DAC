package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class EnterNewValueInArray {
	public static void main(String[] args) {
		int i;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = input.nextInt();
		int array[] = new int[n + 1];
		for (i = 0; i < array.length - 1; i++) {
			System.out.print("enter the element" + (i + 1) + ": ");
			array[i] = input.nextInt();
		}

		System.out.println("\nelements.." + Arrays.toString(array));
		 System.out.print("enter the next value in the array : ");
		 array[n] = input.nextInt();
		 System.out.println("\nelements.." + Arrays.toString(array));
//		 for (int j = 0; j < array.length; j++) {
//			System.out.println(array[j]);
//		}
		input.close();
	}
}
