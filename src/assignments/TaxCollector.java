package assignments;

import java.util.Scanner;

public class TaxCollector{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("name of citizens: ");
	String name = input.next();
	System.out.print("enter their earnings: ");
	int earnings = input.nextInt();
        double tax;
        if (earnings<=30000){
            tax = 0.15 * earnings;
        }else {
            tax = 0.2 * earnings;
        }
        System.out.print(tax);


    }
}