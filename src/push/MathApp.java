import java.util.Scanner;
public class MathApp {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("input a number");
		int number = input.nextInt();

		System.out.println("input a 5 digit number");
		int digit = input.nextInt();

		System.out.println(Kata.even(number));
		System.out.println(Kata.Primenumber(number));
		System.out.println(Kata.Palindrome(number)); 
		System.out.println(Kata.Square(number)); 
		System.out.println(Kata.IsSquare(number));
		System.out.println(Kata.subtract(number,digit));
		System.out.println(Kata.divide(number,digit));
		System.out.println(Kata.factor(number));
	}	
}