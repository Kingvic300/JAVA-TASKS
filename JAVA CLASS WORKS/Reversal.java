import java.util.Scanner;
public class Reversal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number to reverse:");
		int number = input.nextInt();
		reverse(number);
	}
	public static void reverse(int number){
		int num = 0;
		while(number!=0){
			num = num*10 + number%10;
			number = number/10;
		}
		System.out.println("number reversed is:" + num);
	}
}