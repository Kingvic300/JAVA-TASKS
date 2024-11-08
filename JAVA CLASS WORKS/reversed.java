import java.util.Scanner;

import static java.lang.Integer.reverse;

public class reversed{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("enter a number:"); 
	int number = input.nextInt();
 
	System.out.println(Reversal.reverse(number));
	System.out.println(isPalindrome(number));
	}

	public static boolean isPalindrome(int num){
	int number = reverse(num);
	if (number==num){
		return true;
	}else{
		return false;
	}
}
	
} 