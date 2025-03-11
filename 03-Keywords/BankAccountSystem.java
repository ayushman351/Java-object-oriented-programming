class BankAccount {
    static String bankName="Central Bank";
    String accountHolder;
    final String accountNumber;
    private double balance;
    static int totalAccount=0;
    

    BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
        totalAccount++;
    }

    static void getTotalAccounts(){
        System.out.println("Total accounts: "+totalAccount);
    }

    public void getAccountDetails(){
       if(this instanceof BankAccount){
        System.out.println("Bank Name: "+bankName);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Balance: "+balance);
        System.out.println();
       }
    }
}
public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("Johny Bravo", "12343245233", 200000);
        BankAccount account2=new BankAccount("Johny Test", "32512124533", 500000);

        account.getAccountDetails();
        account2.getAccountDetails();
        BankAccount.getTotalAccounts();
        

    }
}