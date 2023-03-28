package Assignment3;

public class Pyramid {

	public static void main(String[] args) {
		int row = 4;
		 int space = 1;
		space = row - 1;
		for (int j = 1; j <= row; j++) {
			for ( int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space--;
			for (int i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
