package Logistics;

import java.util.ArrayList;
import java.util.Scanner;

public class Logistics {
    private static ArrayList<Customer> packages = new ArrayList<Customer>();
    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu(){
        String options = """
                1->Place delivery
                """;
        output(options);
        String choice = input("enter your choice: ");
        switch (choice){
            case "1"-> placeDelivery();

        }
    }
    public static void placeDelivery(){
        String name = input("enter your name: ");
        String address = input("enter your address: ");
        String phone = input("enter your phone number: ");
        String email = input("enter your email: ");
        String packageName = input("enter your mame of package: ");
        Customer customer = new Customer(name, address, phone, email,packageName);
        display("delivery placed successfully");
        packages.add(customer);
    }
    private  static String input(String input){
        System.out.println(input);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private static void output(String output){
        System.out.println(output);
    }
    private static void display(String display) {
        System.out.println(display);
    }

}

