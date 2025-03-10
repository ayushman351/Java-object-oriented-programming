package Level2;

public class Atm {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount("Person1", "2110990351", 10000);

        account1.deposit(1000);
        account1.withdraw(3000);
        account1.displayBalance();
    }
}

class BankAccount{
    String accountHolder;
    String accountNumber;
    private double balance;

    BankAccount(String holder, String number, double balance){
        accountHolder=holder;
        accountNumber=number;
        this.balance=balance;
    }
    
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount deposited: "+amount);
        }
    }

    void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Amount withdraw: "+amount);
        }else{
            System.out.println("Not enough balance");
        }
    }

    void displayBalance(){
        System.out.println("Your current balance is "+balance);
    }
}