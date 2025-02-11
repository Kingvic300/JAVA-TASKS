package codingChallenges;

import java.util.ArrayList;
import java.util.List;

public class CBN {
    List<Bank> banks = new ArrayList<>();
    private int numberOfBanks;
    public Bank addNewBanks(String bankName, String bankNumber){
        Bank bank = new Bank(bankName,bankNumber);
        banks.add(bank);
        numberOfBanks++;
        return bank;
    }
    public int getNumberOfBanks(){
        return numberOfBanks;
    }
    public Bank searchBank(String bankName) {
        for(Bank bank : banks) {
            if(bank.getBankName().equals(bankName)) {
                return bank;
            }
        }
        throw new IllegalArgumentException("No such bank found");
    }
    public void interBankTransfer(Bank bank,String sender, String receiver, double amount, String password){
        Bank senderAccount = searchBank(sender);
        Bank receiverAccount = searchBank(receiver);
        senderAccount.withdraw(amount, password, sender);
        receiverAccount.deposit(amount, receiver);
    }
}
