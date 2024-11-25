import java.util.Scanner;
public class CreditCardCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("enter account number :");
		String accountNumber = input.next();

		System.out.print("enter Beginning Balance :");
		double BeginningBalance = input.nextInt();
		double Charges = 2.676;
		double Credits = 6.877;
		double Limit = 500000;
		double newBalance = BeginningBalance + Charges + Credits;
		if (newBalance >= Limit){
			System.out.print("credit limit exceeded:");
		}else{
			System.out.print("credit limit not exceeded: ");
		}
	}
}