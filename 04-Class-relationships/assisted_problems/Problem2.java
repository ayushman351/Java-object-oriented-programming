package assisted_problems;

import java.util.ArrayList;
// about association relation 
class Bank {
    static String bank="City Bank";
    ArrayList<Customer> customers=new ArrayList<>();
    
    void openAccount(String name, String accountNumber, double balance){
    Customer customer=new Customer(name);
    customer.addAccount(new Account(accountNumber,balance));
    customers.add(customer);
    }
    

}
class Customer {
    String name;
    ArrayList<Account> accounts=new ArrayList<>();

    Customer(String name){
        this.name=name;
    }
   
    void addAccount(Account account){
        accounts.add(account);
    }


}
class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
       }

    void viewBalance(){
        System.out.println("Your current balance is: "+balance);
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.openAccount("James Bond", "123532452", 70000);
        
        // showing customer details from bank
        System.out.println(bank.customers.get(0).name);
        System.out.println(bank.customers.get(0).accounts.get(0).accountNumber);


        //accessing viewBalance() from bank reference
        bank.customers.get(0).accounts.get(0).viewBalance();

        

    }
}
