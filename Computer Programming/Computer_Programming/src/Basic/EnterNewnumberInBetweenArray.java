package Basic;

import java.util.Arrays;
import java.util.Scanner;


public class EnterNewnumberInBetweenArray {
	public static void main(String[] args) {

		int i;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = input.nextInt();
		int array[] = new int[n + 1];
		for (i = 0; i < array.length - 1; i++) {
			System.out.println("enter the element" + (i + 1) + ": ");
			array[i] = input.nextInt();
		}
		System.out.println("\nelements.." + Arrays.toString(array));

		System.out.println("Enter position you want tho enter he number");
		int insertedposition = input.nextInt();
		System.out.print("enter the value in the array at the position " + insertedposition + " :");
		int newnumber = input.nextInt();

		if (insertedposition < array.length - 1) {
			for (i = array.length - 1; i >= insertedposition; i--) {
				array[i] = array[i - 1];
			}
			array[i] = newnumber;
			System.out.println("\nNew array is : ");
			System.out.println("\nelements.." + Arrays.toString(array));
		} else {
			System.out.println("Position is out of range ");
		}

		input.close();
		//WAP to delete an element from an array
		//WAP to delete an element from an array form any position
	}
}
