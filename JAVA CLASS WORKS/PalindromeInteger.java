import java.util.Scanner;
public class PalindromeInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  integer of any amount");
			int digit = input.nextInt();
		Palindrome(digit);
		reverse(digit); 
	}

	public static boolean Palindrome(int number){
		int num = 0;
		int pal = number;
		while(number!=0){
			num = num*10 + number%10;
			number = number/10;
			
		}
			if(pal==num){
				System.out.println(pal+"ispalindrome:");
			}else{
				System.out.println(pal+" not palindrome:"); 

			}	
			return true;
	}
	
	public static int reverse(int number){
	int num = 0;
		while(number!=0){
			num = num*10 + number%10;
			number = number/10;
		}
		System.out.println("number reversed is:" + num);
		return num;
	}
} 