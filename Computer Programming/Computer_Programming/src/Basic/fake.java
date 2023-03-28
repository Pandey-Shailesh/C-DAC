package Basic;

import java.util.Scanner;

public class fake {
	public static void main(String[] args) {
//	int[] count ;
//	count = new int[3];
//	int[] count = new int[3];// you always give the size of array.
//	
//	int array []= {3,4,5,6};
//	int[]a1,a2,a3;//created the 3 arrays.
//	int b1[],b2[];
//	count[0]=45;
//	count[3]=343;
		Scanner input = new Scanner(System.in);
		int[] marks=null;
		//Ask form the user to enter the length/size of an array
		//int marks[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		//int len =input.nextInt();
		marks =new int[10];
		for (int i = 0; i < marks.length; i++) {
		System.out.println("enter element "+i+1+" :");
		marks[i]=input.nextInt();
		
		}
		System.out.println("Length of marks array is: " + marks.length);
		System.out.println("Elements of marks array:");
		for (int i = 0; i < marks.length; i=i+2) {
			marks[i] =input.nextInt();
		}
		System.out.println("\nFor each loop");
		// display the elements of marks array by using for each loop
		for (int i : marks) {
			System.out.print(i + "\t");
		}
		input.close();
	}
}
