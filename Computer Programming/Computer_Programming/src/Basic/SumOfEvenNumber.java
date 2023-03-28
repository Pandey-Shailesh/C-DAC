package Basic;

public class SumOfEvenNumber {
	public static void main(String[] args) {
		// 1.Write the JAVA program to calculate the sum of first 10 even numbers on the console
		 
		int sum = 0;
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

		// 2.WAP to find the greatest numbers among three numbers take the input from the user
		 

//	3.WAP to swap two numbers. Example:
//	a = 20;
//	b = 30;
//	output: 
//	a = 30
//	b = 20
		System.out.println("beforing swaping");
		int a = 20;
		int b = 30;
		int c;
		System.out.println("After Swaping");
		c = a;
		a = b;
		b = c;
		System.out.println("a =" + a);
		System.out.println("b =" + b);

//	4.WAP to print the Half Pyramid star pattern like below:
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

//	5.WAP to print the inverted Half Pyramid star pattern like below:
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*

		for (int i = 5; i >= 1; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

//	6.WAP to print the pyramid number like below:
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

//	7.WAP to check whether the character entered by the user is vowel or consonant using switch case.
		
		
		
		
		
		
		
	}
}
