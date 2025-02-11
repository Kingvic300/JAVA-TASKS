import java.util.Scanner;

public class FinancialApplication{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter balance rate:");
	double balance = input.nextDouble();

	System.out.println("Enter interest rate:"); 
	double annualInterestRate = input.nextDouble();
	double interest = balance*(annualInterestRate/1200);
	System.out.print(interest); 
	}
}