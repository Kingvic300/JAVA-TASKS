import java.util.Scanner;

public class Determined {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Input a number: ");

	int number1 = input.nextInt(); 

		if (number1%4==0) {
			System.out.println("number is divisible");
		}
		else {
			System.out.println("number is not divisible");
		}
	
	}	

}