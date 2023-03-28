package Assignment3;

public class SwapTwoNumbersWithoutUsingVariable {
public static void main(String[] args) {
	int a=10;
	int b=20;
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swaping the Two variables without using the variables.");
	System.out.println("a= "+a);
	System.out.println("b= "+b);
	
}
}
