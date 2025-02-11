package codingChallenges;

public class Account {
    private final Double savingsRate = 0.02;
    private final int NUBANSERIALCODE =  000001457;
    private double interestRateHistory;
    private double balance;
    private String name;
    private String password;
    private String bankNumber;
    private String number;

    public Account(String name, String password, String bankNumber, String number) {
        this.name = name;
        this.password = password;
        this.bankNumber = bankNumber;
        this.number = number;
    }
    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid deposit amount");
        balance += amount;
    }
    public double getBalance(String password) {
        verifyPassword(password);
            return balance;
    }
    public void withdraw(double amount, String password) {
        verifyPassword(password);

        if (amount <= 0) throw new IllegalArgumentException("Invalid withdraw amount");
        if (amount > balance) throw new IllegalArgumentException("Insufficient balance");
        balance -= amount;

    }
    public String getAccountNumber() {
        return generateAccountNumber(bankNumber);
    }
    private String generateAccountNumber(String number) {
        return accountNumberValidator(number);
    }

    private void verifyPassword(String password) {
        if (!this.password.equals(password)) throw new IllegalArgumentException("Invalid password");

    }
    public void savings(double amount){
        if(amount <= 0) throw new IllegalArgumentException("Invalid amount");
        double interestRate = amount * savingsRate;
        interestRateHistory += interestRate;
        balance += interestRate;
    }
    private String accountNumberValidator(String number){
        if(number.length() != 9) throw new IllegalArgumentException("Invalid account number");
        else return number;
    }
//    private String nubanAccountNumberValidator(String number){
//        String validatedNumber = accountNumberValidator(number);
//
//    }
}