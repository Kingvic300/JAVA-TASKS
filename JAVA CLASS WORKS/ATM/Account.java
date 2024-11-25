package ATM;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private String firstName;
    private String lastName;
    private int pin;

    public Account(String firstName, String lastName, int pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }
    public static void createAccount(ArrayList<Account> account) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter your 4 digit pin ");
        int pin = input.nextInt();

        Account contact = new Account(firstName, lastName, pin);
        account.add(contact);

        System.out.println("Account added successfully!");
    }
}
