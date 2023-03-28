package Basic;

public class TempConvertCelToFeranide {
	static double fahrenheit;
	static double conveter(double celcius) {	
		fahrenheit=((celcius*9/5)+32);
		return fahrenheit;
	}
public static void main(String[] args) {
	System.out.println("The temperature Celcius in Fahrenheit is  :"+conveter(120)+" fahrenheit");
}
}
