import java.util.Scanner;
public class MortgageCalculator{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("enter principal amount");
	double principal = input.nextDouble();

	System.out.println("enter the annual interest rate");
	double annual = input.nextDouble();

	System.out.println("enter the duration in years");

	double duration = input.nextDouble();

	double monthlyrate = annual/100/12;

	double numberofmonths = duration*12;

	double numerate = monthlyrate*Math.pow((1+monthlyrate),(numberofmonths));

	double denomin = Math.pow((1+monthlyrate),(numberofmonths))-1;

	double payment = numerate/denomin;

	double monthlypayment = principal * payment;

	System.out.printf("your monthly payment is" + "$" + monthlypayment); 
	
	 


	}

} 