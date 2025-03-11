package access_modifiers;

class BankAccount {
    public long accountNum;
    protected String accountHolder;
    private double balance;
    
    double getBalance(){
        return balance;
    }

    void setBalance(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println(amount+" added to your account");

        }else{
            System.out.println("Invalid amount");
        }

    }
}

class SavingsAccount extends BankAccount{

}
public class BankManagement {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        account.accountHolder="New person";
        account.accountNum=1234567890;
        
        account.setBalance(1000);
        System.out.println("Balance: "+account.getBalance());

        SavingsAccount savingsAccount1=new SavingsAccount();
        savingsAccount1.accountHolder="Jessy west";
        savingsAccount1.accountNum=9457294924L;
        System.out.println(savingsAccount1.accountHolder);
        System.out.println((savingsAccount1.accountNum));
        
        savingsAccount1.setBalance(2500);
        System.out.println("Balance: "+savingsAccount1.getBalance());

    }
}
