package codingChallenges;

import java.util.Scanner;

public class AtmMachine {
    private static final Bank gtbBank = new Bank("Opay","310");
    private static final Bank opay = new Bank("Opay","310");
    public static void main(String[] args) {
        goToMainMenu();
    }
    public static void goToMainMenu() {
        String option = """
                1->Create Account
                2->Deposit Money
                3->Withdraw Money
                4->Transfer Money
                5->Check Balance
                6->Transfer to another bank
                7->Exit
                """;
        display(option);
        mainMenu(input("Enter an option"));
    }

    private static void display(String display) {
        System.out.println(display);
    }

    private static String input(String prompt) {
        display(prompt);
        Scanner userInput = new Scanner(System.in);
       return userInput.nextLine();

    }
    public static void mainMenu(String userInput) {
        switch (userInput) {
            case "1": createAccount();
            case "2": deposit();
            case "3": withdraw();
            case "4": transfer();
            case "5": checkBalance();
            case "6": interBankTransfer();
            case "7": exitApp();
        }
    }

    private static void exitApp() {
        display("Thanks for banking with us");
        System.exit(49);
    }

    private static void checkBalance() {
        String accountNumber = input("Enter the account number");
        String pin = input("Enter the pin");
        gtbBank.getBalance(accountNumber, pin);
        goToMainMenu();

    }

    private static void transfer() {
            String senderAccountNumber = input("Enter account number");
            String receiverAccountNumber = input("Enter account number");
            int amount = Integer.parseInt(input("Enter amount"));
            String pin = input("Enter pin");
            gtbBank.transfer(senderAccountNumber, receiverAccountNumber, amount, pin);
            display("Transfer Successful");
            display(String.format("Balance is " + gtbBank.searchAccount(senderAccountNumber).getBalance(pin)));

        goToMainMenu();

    }
    private static void interBankTransfer() {
        String senderAccountNumber = input("Enter account number");
        String receiverAccountNumber = input("Enter account number");
        int amount = Integer.parseInt(input("Enter amount"));
        String pin = input("Enter pin");
        gtbBank.interBankTransfer(opay,senderAccountNumber, receiverAccountNumber, amount, pin);
        display("Transfer Successful");
        display(String.format("Balance is " + gtbBank.searchAccount(senderAccountNumber).getBalance(pin)));

        goToMainMenu();
    }

    private static void withdraw() {
        String accountNumber = input("Enter account number");
        int amount = Integer.parseInt(input("Enter amount"));
        String pin = input("Enter pin");
        gtbBank.withdraw(amount,accountNumber,pin);
        display("Withdraw Successful");
        display(("Balance is " + gtbBank.searchAccount(accountNumber).getBalance(pin)));
        goToMainMenu();

    }

    private static void deposit() {
            String accountNumber = input("Enter account number");
            int amount = Integer.parseInt(input("Enter amount"));
            String pin = input("Enter pin");
            gtbBank.deposit(amount, accountNumber);
            display("Deposit Successful");
            display(("Balance is " + gtbBank.searchAccount(accountNumber).getBalance(pin)));
        goToMainMenu();

    }

    private static void  createAccount() {
        String name = input("Enter account name");
        String accountNumber = input("Enter account number");
        String pin = input("Enter pin");
        gtbBank.createAccount(name,pin,accountNumber);
        display("Create Account Successful");
        goToMainMenu();

    }
}
