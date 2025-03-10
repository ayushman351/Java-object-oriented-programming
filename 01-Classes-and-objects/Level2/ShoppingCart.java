package Level2;

import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args) {
        Cart myCart=new Cart();

        myCart.addItem("Laptop", 50000, 1);
        myCart.addItem("Phone", 30000, 2);
        myCart.addItem("Mouse", 300, 3);

        myCart.displayCart();
    }
}

// class cart to manage multiple cart items and perform operations like add and display
class Cart{
    ArrayList<CartItem> cart;
     
    Cart(){
        cart=new ArrayList<>();
    }

    //method to add items in cart
     void  addItem(String name, double price, int quantity){
            cart.add(new CartItem(name, price, quantity));
            System.out.println(name+" added to cart");
    }

    // display  cart 

    void displayCart(){
        if(cart.isEmpty()){
            System.out.println("Your cart is empty!");
        }
        System.out.println("Items in your cart: ");

        double totalCost=0;

        for(CartItem item:cart){
            double itemTotal=item.price*item.quantity;
            System.out.println(item.itemName+" : "+item.price+"x"+item.quantity+"="+itemTotal);
            totalCost+=itemTotal;
        }

        System.out.println("Total cost of your cart: "+totalCost);
    }

    
}

// class to create an item
class CartItem{
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }


}

