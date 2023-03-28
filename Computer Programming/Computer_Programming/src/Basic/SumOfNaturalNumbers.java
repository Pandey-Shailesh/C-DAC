package Basic;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=0;
		int total=0;
//		int sum =0;
//		for (int i = 0; i <=10; i++) {
//			sum=sum+i;	
//		}
//		System.out.println(sum);
		System.out.print("how many numbers you want to add : ");
		int number = input.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.println("Enter the no."+i);
			num = input.nextInt();	
			total = total+num;
		}
		System.out.println("total="+total);
		
		input.close();
	}
}
