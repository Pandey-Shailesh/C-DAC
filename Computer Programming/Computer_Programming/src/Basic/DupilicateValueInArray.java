package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class DupilicateValueInArray {
	public static void main(String[] args) {
		// WAP to find all the duplicate position values in an array

		int num;
		int pos = 0;
		int arr[] = new int[5];
		int index[] = new int[5];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the element " + (i + 1) + ":  ");
			arr[i] = input.nextInt();
		}
		// Display the array elements
		System.out.println("\nArray Elements: " + Arrays.toString(arr));

		System.out.print("Enter the element to search:  ");
		num = input.nextInt(); // 40

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				index[pos] = i;
				pos++;
			}
		}
		if (pos == 0) {
			System.out.println("\n Element not found");
		} else if (pos == 1) {
			System.out.println("\n The element found at position = " + index[0]);
		} else {
			for (int i = 0; i < pos; i++) {
				System.out.println("\n The element found at position = " + index[i]);
			}
		}
		input.close();
	}

}
