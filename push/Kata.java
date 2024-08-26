import java.util.Scanner;
public class Kata{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("input a number");
	int number = input.nextInt();
	System.out.println("input a 5 digit number");
	int digit = input.nextInt(); 
	System.out.println(even(number));
	System.out.println(Primenumber(number));
	System.out.println(Palindrome(number)); 
	System.out.println(Square(number)); 
	}

	public static boolean even (int number){
		if (number%2==0) {
			return true;
		}else {
			return false; 

		}
	}
	
	public static boolean Primenumber(int number){
		int factors = 0; 
		for(int count = 1;count <= number; count++){
			if(number%count==0) 
				factors++;
		}
		if(factors==2){
			return true;
		}else {
			return false;

		}
	}
	public static boolean Palindrome(int number){
		int digit = 0;
		int number1 = digit;
		int digit1 = number%10;
		int digit2 = number/10;
		int digit3 = digit2%10;
		int digit4 = digit2/10;
		if (digit1==digit4){
			return true;
		}else { 
			return false;
		}	
	}

	public static long Square(int number){
	int square = number*number;
	return square;
	}
	
	public static boolean IsSquare(double number){
	Double squared = Math.sqrt(number);
	if (number%squared==0){
		return true;
	}else{
		return false;
	} 
}
}