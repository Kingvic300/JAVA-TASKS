import java.util.Scanner;

public class number {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Input number one");
		int numberOne = input.nextInt();

		System.out.println("Input number two");
		int numberTwo = input.nextInt();

		if(numberOne > numberTwo) {
			System.out.printf("NumberOne is greater\n");
		} else {
			System.out.printf("NumberTwo is greater\n");
		}
	}
}