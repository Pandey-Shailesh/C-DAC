package Assignment2;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Character: ");
		char character = input.next().charAt(0);

		char z = Character.toUpperCase(character); // Changing Value to UpperCase for uniformity.

		switch (z) { // Checking Vowel Character using Switch Case
		case 'A':
			System.out.println(character + " is a Vowel.");
			break;
		case 'E':
			System.out.println(character + " is a Vowel.");
			break;
		case 'I':
			System.out.println(character + " is a Vowel.");
			break;
		case 'O':
			System.out.println(character + " is a Vowel.");
			break;
		case 'U':
			System.out.println(character + " is a Vowel.");
			break;

		default:
			System.out.println(character + " is a Non-Vowel Character.");
		}
		input.close();

	}
}
