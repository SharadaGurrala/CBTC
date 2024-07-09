import java.util.ArrayList;
import java.util.List;



public class Bank {
    private List<BankAccount> accounts;

    public Bank(){
        accounts = new ArrayList<>();

    }

public void createAccount(String accountNumber, String accountHolder){
    BankAccount account = new BankAccount(accountNumber,accountHolder);
    accounts.add(account);
    System.out.println("Account created successfully "+account);
}
    


public BankAccount getAccount(String accountNumber){
    for(BankAccount account : accounts){
        if(account.getAccountNumber().equals(accountNumber)){
            return account;
        }
    }

    System.out.println("Account not found\n");
      return null;
}
}