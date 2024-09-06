import java.util.Scanner;
public class Prime{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter a number below 10000:"); 
	int number = input.nextInt();
	IsPrime(number);
	}
	public static void IsPrime(int number){
	int factors = 0; 
	for(int count = 1;count <= number; count++){

		if(number%count==0) factors++;
	}
		if(factors==2)
			System.out.println("number is a prime number");
		if(factors!=2)
			System.out.println("number is not a prime number");   
	}
} 