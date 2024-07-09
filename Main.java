public class Main {
    public static void main(String args[]){
        Bank bank=new Bank();

        //creating acounts
        bank.createAccount("12345678", "Shara joy");
        bank.createAccount("98765432", "Joy grace");


        //depositing 
        BankAccount account1 = bank.getAccount("12345678");
        if(account1!=null){
            account1.deposit(1000);
        }

        //withdraw
        if(account1!=null){
        account1.withdraw(500);
        }

        //transfer
        BankAccount account2 =bank.getAccount("98765432");
        if(account1 != null && account2 != null){
            account1.transfer(account2,200);
        }

        System.out.println("Account1 details "+account1);
        System.out.println("Account2 details "+account2);


    }
    
}
