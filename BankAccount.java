import java.io.Serializable;

public class BankAccount implements Serializable{
    private String accountNumber;
    private String accountHolder;
    private double balance;


    public BankAccount(String accountNumber, String accountHolder){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=0.0;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
        System.out.println(amount+" amount withdrawed successfully\n");
        }
        else{
            System.out.println("invalid amount entry\n");
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("deposited "+amount+" amount\n");
        }
        else{
            System.out.println("invalid amount entry\n");
        }
    }

    public void transfer(BankAccount toAccount,double amount){
        if(amount > 0 && amount <= balance){
            this.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("transferd amount "+amount+" to the account "+toAccount+"\n");
        }
        else{
            System.out.println("invalid entry of amount\n");
        }
    }

    public String toString(){
        return "AccountNumber : "+accountNumber+" Account Holder "+accountHolder+" and Account Balance "+balance;
    }










}
