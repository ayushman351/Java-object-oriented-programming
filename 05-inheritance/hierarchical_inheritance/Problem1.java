package hierarchical_inheritance;

class BankAccount {
    String accountNum;
    double balance;

    BankAccount(String accountNum, double balance){
        this.accountNum=accountNum;
        this. balance=balance;
    }

    void displayAccountType(){
        System.out.println("This is your Bank account");
        System.out.println("Account Details: ");
        System.out.println("Account Number: "+accountNum+", Balance: "+balance );
        System.err.println();
    }
}

class SavingsAccount extends BankAccount{
    int interestRate;

    SavingsAccount(int interestRate, String accountNum, double balance){
        super(accountNum, balance);
        this.interestRate=interestRate;
    }

    void displayAccountType(){
        System.out.println("This is your savings account");
        System.out.println("Account details: ");
        System.out.println("Interest Rate: "+interestRate);
        System.out.println();
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(double withdrawalLimit,String accountNum, double balance){
        super(accountNum, balance);
        this.withdrawalLimit=withdrawalLimit;
    }

    void displayAccountType(){
        System.out.println("This is your checking account!");
        System.out.println("Account Details:");
        System.out.println("Withdrawal Limit: "+withdrawalLimit);
        System.out.println();
    }
}

class FixedDepositAccount extends BankAccount {
    double depositAmount;

    FixedDepositAccount(double depositAmount, String accountNum, double balance){
        super(accountNum, balance);
        this.depositAmount=depositAmount;
    }

    void displayAccountType(){
        System.out.println("This is your Fixed desposit account");
        System.out.println("Account details:");
        System.out.println("Desposit amount: "+depositAmount);
    }
}
public class Problem1 {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount("32523511255",65000);
        BankAccount account2=new SavingsAccount(15, "3426662324", 60000);
        BankAccount account3=new CheckingAccount(120000, "6235623227", 70000);
        BankAccount account4=new FixedDepositAccount(100000, "820943563", 100000);

        account1.displayAccountType();
        account2.displayAccountType();
        account3.displayAccountType();
        account4.displayAccountType();

        
    }
    
}
