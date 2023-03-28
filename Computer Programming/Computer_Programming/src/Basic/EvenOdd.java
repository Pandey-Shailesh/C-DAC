package Basic;
import java.util.Scanner;
public class EvenOdd {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	if(num%2==0) {
		System.out.println("Even number");
	}else {
		System.out.println("odd number");
	}
	
	//ternary Operator
	//syntax: (condition)?"if statement":"else statement"
	String evenOdd= (num%2==0)? "even" : "odd" ;
	System.out.println(evenOdd);
	input.close();
}
}
