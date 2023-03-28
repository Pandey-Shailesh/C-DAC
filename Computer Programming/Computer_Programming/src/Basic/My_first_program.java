package Basic;

public class My_first_program {

	static int age;
	static short sh;
	static byte bt;
	static char ch;
	static float ft;// default values..
	static double db;
	static boolean bl;

	public static void display() {
		System.out.println("shailesh");
	}

	public static void main(String[] args) { // Entry point of an application
		System.out.println("My frist java program..");
		// Scanner input = new Scanner(System.in);

		System.out.println(age);
		System.out.println(sh);
		System.out.println(bt);
		System.out.println(ch);
		System.out.println(ft);
		System.out.println(db);
		System.out.println(bl);

		double maxDouble = Double.MAX_VALUE;
		double minDouble = Double.MIN_VALUE;

		float maxFloat = Float.MAX_VALUE;
		float minFloat = Float.MIN_VALUE;

		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		System.out.println(maxDouble);
		System.out.println(minDouble);

		System.out.println(maxFloat);
		System.out.println(minFloat);

		System.out.println(maxInt);
		System.out.println(minInt);

		System.out.println("Maximum Value for the Long Data Type = " + Long.MAX_VALUE);

		int decimalValue = 125; // decimal literal
		int octalValue = 0146; // octal literal
		int hexValue = 0x123F; // hexa-decimal literal
		System.out.println(octalValue);
		System.out.println(hexValue);
		System.out.println(decimalValue);

		String name = "shailesh";
		System.out.println("Total length " + name.length());
		System.out.println(name.toUpperCase());
	}

}