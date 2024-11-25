package ATM;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Account> account = new ArrayList<>();
        System.out.println("WELCOME TO SEMICOLON BANK\n Here are the list of what you can do\n 1-> Create account");
            int response = input.nextInt();
        if (response == 1) {
            Account.createAccount(account);
        }
    }
}
