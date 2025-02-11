import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a three digit integer");
	int digit = input.nextInt();
	int number = digit;
	int digit1 = number%10;
	int digit2 = number/10;
	int digit3 = digit2%10;
	int digit4 = digit2/10;
	if (digit1==digit4){
		System.out.println("number is palindrome");
	}else if (digit1!=digit4){ 
		System.out.println("number is not palindrome");
}	
	




	}	




}