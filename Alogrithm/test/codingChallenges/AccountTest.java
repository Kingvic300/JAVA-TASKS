package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void testThatAccountCanDeposit() {
        Account account = new Account("Victor","123","07084159495");
        account.deposit(100);
        double balance = account.getBalance("123");
        int result = 100;
        assertEquals(result,balance);
    }
    @Test
    public void testThatAccountCanWithdraw() {
        Account account = new Account("Victor","123","07084159495");
        account.deposit(1500);
        account.withdraw(1000,"123");
        double balance = account.getBalance("123");
        int result = 500;
        assertEquals(result,balance);
    }
    @Test
    public void testThatAccountCanWithdraw2() {
        Account account = new Account("Victor","123","07084159495");
        account.deposit(1500);
        account.withdraw(1000,"123");
        double balance = account.getBalance("123");
        assertEquals(balance,500);
    }
    @Test
    public void testThatAccountCanWithdraw3() {
        Account account = new Account("Victor","123","07084159495");
        account.deposit(1500);
        account.withdraw(1000,"123");
        double balance = account.getBalance("123");
        assertEquals(balance,500);
    }
    @Test
    public void testThatAccountCanSave(){
        Account account = new Account("Victor","123","07084159495");
        account.deposit(1500);
        account.savings(1500);
        double balance = account.getBalance("123");
        assertEquals(balance,1530);
    }
}
