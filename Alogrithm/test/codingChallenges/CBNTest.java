package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CBNTest {

    @Test
    public void addNewBanks() {
        CBN bank = new CBN();
        bank.addNewBanks("Opay","310");
        assertEquals(1,bank.getNumberOfBanks());
    }

    @Test
    public void searchBank() {
        CBN bank = new CBN();
        bank.addNewBanks("Opay","310");
        String bankName = bank.searchBank("Opay").getBankName();
        assertEquals("Opay",bankName);
    }

    @Test
    public void interBankTransfer() {
        CBN bank = new CBN();
        Bank banks = new Bank("Opay","310");
        Bank firstAccount = bank.addNewBanks("Opay","310");
        Account senderAccount = firstAccount.createAccount("Victor","123", "07084159495");
        senderAccount.deposit(1_000);
        assertEquals(1_000_000, senderAccount.getBalance("123"));

        Bank secondAccount = bank.addNewBanks("access","223");
        Account receiverAccount = secondAccount.createAccount("Victor","123", "07084159495");

        String firstAccountNumber = banks.generateAccountNumber(senderAccount);
        String secondAccountNumber = banks.generateAccountNumber(receiverAccount);

        bank.interBankTransfer(banks,firstAccountNumber,secondAccountNumber,5000,"123");
        assertEquals(500_000, receiverAccount.getBalance("123"));
        assertEquals(500_000, senderAccount.getBalance("123")); }
}