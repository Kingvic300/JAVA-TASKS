import java.util.Scanner;

public class TaxsCollector {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("name of citizens: ");
	String name = input.next();
	System.out.print("enter their earnings: ");
	int earnings = input.nextInt();
	if (earnings<=30000){
		double tax = 0.15*earnings;
		System.out.print(tax);
	}else {
		double tax = 0.2*earnings;
		System.out.print(tax); 
	}


	}
}