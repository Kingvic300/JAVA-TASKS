package codingChallenges;

public class Account {
    private double balance;
    private String name;
    private String password;
    private String number;

    public Account(String name, String password, String number) {
        this.name = name;
        this.password = password;
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
        return generateAccountNumber(number);
    }
    private String generateAccountNumber(String number) {
       return number.substring(1);
    }

    private void verifyPassword(String password) {
        if (!this.password.equals(password)) throw new IllegalArgumentException("Invalid password");

    }
}