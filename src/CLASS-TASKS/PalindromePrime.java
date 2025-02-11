import java.util.Scanner;
public class PalindromePrime {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a palindromic prime number:"); 
	int number = input.nextInt();
	System.out.print(PalindromePrime(number)); 

	}
	public static int PalindromePrime(int number) {
		int count = 0;
		int num = 0;
		int pal = number;
		int factors = 0;
		while (number != 0) {
			num = num * 10 + number % 10;
			number = number / 10;
		}
		for (count = 1; count <= number; count++) {

			if (number % count == 0) factors++;
		}

		return count;
	}
}