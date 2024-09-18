import java.lang.Math;
import java.util.Scanner;
public class Algebra{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a:");
		double number = input.nextDouble();

		System.out.println("Enter b:");
		double digit = input.nextDouble();

		System.out.println("Enter c:");
		double num = input.nextDouble();

		double square = digit*digit;

		double nums = 4*number*num;

		double discriminant = square-nums; 

		double squareRoot = Math.sqrt(discriminant);

		double roots = -digit+squareRoot;

		double root = roots/2*number;

		System.out.println(root); 
	}
} 