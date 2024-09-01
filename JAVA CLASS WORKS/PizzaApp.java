

import java.util.Scanner;

public class PizzaApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Number of guests that will attend the birthday party:");
        int guests = scan.nextInt();

        System.out.println("Type of pizza (Sapa size, Small money, big boys, Odogwu):");
        String pizza = scan.next();

        int numberOfSlices = 0;
        int pricePerBox = 0;

        if (pizza.equals("Sapa size")) {
            numberOfSlices = 4;
            pricePerBox = 2000;
        } else if (pizza.equals("Small money")) {
            numberOfSlices = 6;
            pricePerBox = 2400;
        } else if (pizza.equals("big boys")) {
            numberOfSlices = 8;
            pricePerBox = 3000;
        } else if (pizza.equals("Odogwu")) {
            numberOfSlices = 12;
            pricePerBox = 4200;
        }

        int boxesOfPizza = ( guests / numberOfSlices)+1;
        int totalSlice = boxesOfPizza * numberOfSlices;
        int leftOver = totalSlice - guests;
        int totalPrice = pricePerBox * boxesOfPizza;

        System.out.println("Number of pizza to buy: " + boxesOfPizza + " boxes");
        System.out.println("Number of leftover: " + leftOver + " slices");
        System.out.println("Price: " + totalPrice);
    }
}