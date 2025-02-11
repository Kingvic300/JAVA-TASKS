package assignments;

import java.util.Scanner;

public class Encryption {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 4 digit number to encrypt: ");
		int number = input.nextInt();

		if (number < 1000 && number > 9999) {
			System.out.println("Number must be a 4 digit number!");
		} else {
			int firstDigit = ((number/1000) + 7) % 10;
			int secondDigit = (((number/100) % 10) + 7) % 10;
			int thirdDigit = (((number/10) % 10) + 7) % 10;
			int fourDigit = ((number % 10) + 7) % 10;

			int Digit = (thirdDigit * 1000) + (fourDigit * 100) + (thirdDigit * 10) + secondDigit;
		
			System.out.printf("Encrypted data: %d", Digit);
		}
	}
}