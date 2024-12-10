public class Kata{
	
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
	public static int subtract(int number,int digit){
		if(number>digit){
			return (number-digit);
		} else {
			return (digit-number);
		}
	}
 	public static float divide(int number,int digit){
		int division = number/digit;
			return division;	
	}
	public static int factor(int number){
		int factors = 0;
		for(int count = 1; count<=number; count++){
			if (number%count ==0)
			factors++;
		}
			return factors;	
	}
	public static long Factorial(int number){
		int factorial = 1;
		for (int count = number; count>=1; count--){
			factorial = factorial*count;
		}
				return factorial;
	}
	
}


