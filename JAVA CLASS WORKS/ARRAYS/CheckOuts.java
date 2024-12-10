package ARRAYS;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckOuts {


    static ArrayList<String> productName = new ArrayList<>();
    static ArrayList<Integer> quantity = new ArrayList<>();
    static ArrayList<Double> price = new ArrayList<>();
    static ArrayList<Double> total = new ArrayList<>();

    static double discountPercentage;
    static double amountPaid;
    static double subTotal;
    static double discountedPrice;
    static double vat;
    static double billTotal;
    static double balance;
    static String cashierName;
    static String customerName;

    public static void main(String [] args){

        collectInput();
        calculateTotalProduct();
        calculateSubTotal();
        calculateDiscount();
        calculateVat();
        calculateBillTotal();
        calculateBalance();
        printReceipt();
        printReceipt1();



    }

    public static void collectInput(){
        Scanner userInput = new Scanner(System.in);

        System.out.println(" >>>> ChopChopStore <<<< ");
        System.out.println(" Wellcome LOVE TO CHECKOUT CHOPCHOP STORE )( ");

        System.out.print(" What is the customers name: ");
        String customersName = userInput.next();

        while(true){

            System.out.print(" What did you buy?: ");
            String productName = userInput.next();

            System.out.println(" How many pieces?: ");
            int pieces = userInput.nextInt();

            System.out.println(" How much per unit?: ");
            String unitprice = userInput.next();

            System.out.println(" Add more items? (yes/no): ");
            String answer = userInput.next();

            if(answer.equalsIgnoreCase("NO")){
                break;
            }
        }

        System.out.print(" What is the cashiername: ");
        String cashierName = userInput.next();

        System.out.print(" How much discount will he/she get? ");
        double discountPrcentage = userInput.nextDouble();

    }
    public static void calculateTotalProduct(){
        for(int index = 0; index < quantity.size(); index++){
            double totalPrice = price.get(index) * quantity.get(index);
            total.add(totalPrice);

        }
    }

    public static void calculateSubTotal(){
        for(int index = 0; index < total.size(); index++){
            subTotal += total.get(index);
        }
    }

    public static void calculateDiscount(){
        discountedPrice = (discountPercentage / 100) * subTotal;
    }

    public static void calculateVat(){
        vat = (17.50 / 100) * subTotal;
    }

    public static void calculateBillTotal(){
        billTotal = subTotal - discountedPrice + vat;
    }

    public static void calculateBalance(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("How much did the custom give to you?");
        amountPaid = userInput.nextDouble();
        balance = amountPaid - billTotal;
    }

    public static void printReceipt(){
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
    }

    public static void printReceipt1(){

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