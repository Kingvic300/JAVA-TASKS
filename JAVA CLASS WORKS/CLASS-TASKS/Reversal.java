import java.util.Scanner;
public class Reversal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number to reverse:");
		int number = input.nextInt();
		System.out.println(reverse(number));
	}
	public static int reverse(int number){
		int num = 0;
		while(number!=0){
			num = num*10 + number%10;
			number = number/10;
		}
		return num;
	}
}