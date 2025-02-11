package assignments;

import java.util.Scanner;
public class CreditCardCalculate{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("enter account number :"); 
	String accountnumber = input.next();

	System.out.print("enter Beginning Balance :");
	double BeginningBalance = input.nextInt();

	double Charges = 2.676;

	double Credits = 6.877;
	double Limit = 500000;
	double newbalance = BeginningBalance + Charges + Credits;
	if (newbalance >= Limit){
		System.out.print("credit limit exceeded:");
	}else{
		System.out.print("credit limit not exceeded: ");
	}
	}

}