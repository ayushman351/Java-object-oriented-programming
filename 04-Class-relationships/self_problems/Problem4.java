package self_problems;

import java.util.ArrayList;

class Customer {
    String name;
    ArrayList<Order> orders=new ArrayList<>();

    Customer(String name){
        this.name=name;
    }   
    
    void placeOrder(String orderId, String productName, double price, int quantity){
        Order order=new Order(orderId);
        order.products.add(new Product(productName, price, quantity));
        orders.add(order); 
        System.out.println("Order place, orderID: "+orderId);  
    }

}

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;     
    }
}

class Order {
    String orderId;
    ArrayList<Product> products=new ArrayList<>();

    Order(String orderId){
         this.orderId=orderId;
    }
       
}

public class Problem4 {

    public static void main(String[] args) {
        Customer customer=new Customer("Larry");
        customer.placeOrder("yx0221", "Mobile phone", 35000, 2);
        customer.placeOrder("zdx8202", "Laptop", 55500, 1);

    }
}

