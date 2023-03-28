package Assignment3;

import java.util.Scanner;

public class SwitchCaseVowelsOrConsonent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the charcter: ");
		char character = input.next().charAt(0);

		switch (character) {
		case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U':
			System.out.println(character + " is vowel");
			break;

		default:
			System.out.println(character + " is Consonent");
		}
		input.close();
	}
}
