package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void testThatCreateAccountWorks(){
        Bank bank = new Bank("access","232");
        Account account = bank.createAccount("Victor","123","07084159495");
        int numberOfAccounts = bank.getNumberOfAccounts();
        assertEquals(1,numberOfAccounts);
    }
    @Test
    public void testThatDepositMoneyWorks(){
        Bank bank = new Bank("access","232");
        Account account = bank.createAccount("Victor","123","07084159495");
        String accountNumber = bank.generateAccountNumber(account);
        bank.deposit(1000,accountNumber);
        double balance = bank.getBalance("123",accountNumber);
        assertEquals(1000,balance);
    }
    @Test
    public void testThatWithdrawMoneyWorks(){
        Bank bank = new Bank("access","232");
        Account account = bank.createAccount("Victor","123","07084159495");
        String accountNumber = bank.generateAccountNumber(account);
        bank.deposit(1000,accountNumber);
        bank.withdraw(500,accountNumber,"123");
        double balance = bank.getBalance("123",accountNumber);
        assertEquals(500,balance);
    }
    @Test
    public void testThatTransferMoneyWorks(){
        Bank bank = new Bank("access","232");
        Account firstAccount = bank.createAccount("Victor","123","07084159495");
        Account secondAccount = bank.createAccount("Akerele","1234","08144782521");

        String firstAccountNumber = bank.generateAccountNumber(firstAccount);
        String secondAccountNumber = bank.generateAccountNumber(secondAccount);

        bank.deposit(10_000, firstAccountNumber);
        assertEquals(10_000,bank.getBalance("123",firstAccountNumber));

        bank.transfer(firstAccountNumber,secondAccountNumber,7000,"123");
        assertEquals(3000, bank.getBalance("123",firstAccountNumber));
        assertEquals(7000, bank.getBalance("1234",secondAccountNumber));
    }
    @Test
    public void testThatInterBankTransferWorks(){
        Bank gtbBank = new Bank("access","232");
        Bank opay = new Bank("Opay","310");
        Account firstAccount = gtbBank.createAccount("Victor","123","07084159495");
        Account secondAccount = opay.createAccount("Victor","123","07084159495");

        String firstAccountNumber = gtbBank.generateAccountNumber(firstAccount);
        String secondAccountNumber = opay.generateAccountNumber(secondAccount);

        gtbBank.deposit(10_000,firstAccountNumber);
        assertEquals(10_000,gtbBank.getBalance("123",firstAccountNumber));

        gtbBank.interBankTransfer(opay,firstAccountNumber,secondAccountNumber,5000,"123");
        assertEquals(5000, gtbBank.getBalance("123",firstAccountNumber));
        assertEquals(5000,opay.getBalance("123",secondAccountNumber));

    }
}

