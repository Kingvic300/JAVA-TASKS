package ARRAYS;

import java.util.ArrayList;
import java.util.Scanner;
public class CheckOut{

    public static void main(String [] args){
         ArrayList<String> productName = new ArrayList<>();
         ArrayList<Integer> quantity = new ArrayList<>();
         ArrayList<Double> price = new ArrayList<>();
         ArrayList<Double> total = new ArrayList<>();

         Scanner userInput = new Scanner(System.in);

        System.out.println(" >>>> ChopChopStore <<<< ");
        System.out.println(" Wellcome LOVE TO CHECKOUT CHOPCHOP STORE )( ");

        System.out.print(" What is the customers name: ");
        String customerName = userInput.next();

        while(true){

            System.out.print(" What did you buy?: ");
            String product = userInput.next();
            productName.add(product);

            System.out.println(" How many pieces?: ");
            int pieces = userInput.nextInt();
            quantity.add(pieces);

            System.out.println(" How much per unit?: ");
            double unitprice = userInput.nextDouble();
            price.add(unitprice);


            System.out.println(" Add more items? (yes/no): ");
            String answer = userInput.next();

            if(answer.equalsIgnoreCase("NO")){
                break;
            }
        }

        System.out.print(" What is the cashiername: ");
        String cashierName = userInput.next();

        System.out.print(" How much discount will he/she get? ");
        double discountPercentage = userInput.nextDouble();


        for(int index = 0; index < quantity.size(); index++){
            double totalPrice = price.get(index) * quantity.get(index);
            total.add(totalPrice);

        }
        double subTotal = 0;
        double discountedPrice = 0;
        for(int index = 0; index < total.size(); index++){
            subTotal += total.get(index);
        }
        discountedPrice = (discountPercentage / 100) * subTotal;


       double  vat = (17.50 / 100) * subTotal;


        double billTotal = subTotal - discountedPrice + vat;

        System.out.println("How much did the custom give to you?");
        double amountPaid = userInput.nextDouble();
        double balance = amountPaid - billTotal;


        System.out.printf("SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA LAGOS.\nTEL: 03293828343\nDate: 18-Dec-22 8:40:11 pm\nCashier: %s%nCustomer Name: %s%n",cashierName, customerName);
        System.out.println("""
		====================================
		ITEM\tQTY\tPRICE\tTOTAL(NGN)
		====================================
		""");
        for(int index = 0; index < productName.size(); index++){
            System.out.printf("%s\t%d\t%.2f\t%.2f%n",productName.get(index), quantity.get(index), price.get(index), total.get(index));
        }
        System.out.printf("""
		--------------------------------------
			    Sub total: %.2f

		            Discount: %.2f

			    VAT @ 17.50%%: %.2f
		======================================%n""",subTotal, discountedPrice, vat);

        System.out.printf("SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA LAGOS.\nTEL: 03293828343\nDate: 18-Dec-22 8:40:11 pm\nCashier: %s%nCustomer Name: %s%n",cashierName, customerName);
        System.out.println("""
		====================================
		ITEM\tQTY\tPRICE\tTOTAL(NGN)
		====================================
		""");
        for(int index = 0; index < productName.size(); index++){
            System.out.printf("%s\t%d\t%.2f\t%.2f%n",productName.get(index), quantity.get(index), price.get(index), total.get(index));
        }
        System.out.printf("""
		--------------------------------------
			    Sub total: %.2f

		             Discount: %.2f

			VAT @ 17.50%%: %.2f
		======================================%n""",subTotal, discountedPrice, vat);
        System.out.printf("""
			Bill Total: %.2f
	
			 Amount Paid: %.2f
			     Balance: %.2f%n""",billTotal, amountPaid, balance);
        System.out.println("""
		=======================================

		THANKS YOU FOR YOUR PATRONAGE

		=======================================
		""");
    }
}