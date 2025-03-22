abstract class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    BankAccount(String accountHolder, long accountNumber, double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    
    public String getAccountHolder() {// accessing account holder
        return accountHolder;
    }

    public double getBalance() {//accessing balance
        return balance;
    }

    public void setBalance(double balance) {//modifying balance
        this.balance = balance;
    }

    void deposit(double amount){// method to deposit money
        if(amount>0){
          balance+=amount;
          System.out.println("Amount Deposited: $"+amount);
        }else{
            System.out.println("Invalid amount!");
        }
    }

    void withdraw(double amount){// method to withdraw money
        if(amount>0&&balance>=amount){
            balance-=amount;
            System.out.println("Amount withdrawed: $"+amount);
        }else{
            System.out.println("Not enough balance or invalid amount entered!");
        }
    }

    abstract void calculateInterest();

}


interface Loanable {
    void applyForLoan(double amount);
    void calculateLoanEligibilty();
}


class SavingsAccount extends BankAccount implements Loanable{
    private double interestRate=5.0;
    SavingsAccount(String accountHolder, long accountNumber, double balance){
        super(accountHolder, accountNumber, balance);
    }
    @Override
    public void calculateInterest(){
        double interest=(getBalance()*interestRate)/100;
        setBalance(getBalance()+interest);
        System.out.println("Interest added: "+interest+" to your balance: "+getBalance());
    }
    @Override
    public void applyForLoan(double amount) {
        if(getBalance()>10000){
            System.out.println("Loan of "+amount+" is approved for "+getAccountHolder());
        }else{
            System.out.println("Loan application denied for "+getAccountHolder()+", maintain a minimum balance");
        }
    }
    @Override
    public void calculateLoanEligibilty() {
        System.out.println(getAccountHolder()+" is eligible for loan if balance>10000");
    }
}


class CurrentAcccount extends BankAccount implements Loanable{
    private double overdraftLimit=350000;
    CurrentAcccount(String accountHolder, long accountNumber, double balance){
        super(accountHolder, accountNumber, balance);
    }
    @Override
    void calculateInterest() {
        System.out.println("This account do not earn interest!");
    }
    @Override
    public void applyForLoan(double amount) {
        if(getBalance()+overdraftLimit>amount){
            System.out.println("Loan of "+amount+" is approved for "+getAccountHolder());
        }else{
            System.out.println("Loan request denied for "+getAccountHolder()+", Insufficient funds!");
        }
    }
    @Override
    public void calculateLoanEligibilty() {
        System.out.println(getAccountHolder()+" is eligible for loan upto "+(getBalance()+overdraftLimit));
    }
}


public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount("Judy Garcia", 52367823, 50000);
        CurrentAcccount currentAcccount=new CurrentAcccount("Richard Parker", 93280926, 100000);

        savingsAccount.calculateInterest();
        savingsAccount.applyForLoan(100000);
        savingsAccount.calculateLoanEligibilty();
        System.out.println();

        currentAcccount.calculateInterest();
        currentAcccount.applyForLoan(500000);
        currentAcccount.calculateLoanEligibilty();
    }
}
