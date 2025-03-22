abstract class FoodItem {
    String itemName;
    double price;
    int quantity;
    double discount;

    FoodItem(String itemName, double price, int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }

     void getItemDetails(){
        System.out.println("Item name: "+itemName+", Quantity: "+quantity+", Price: "+price);     
    }

    abstract void calculateTotalPrice();
}


interface Discountable {

    void applyDiscount(int discountPercentage);
    void getDiscountDetails();

}


class VegItem extends FoodItem implements Discountable{

    VegItem(String itemName, double price, int quantity){
        super(itemName, price, quantity);
    }

    @Override 
    public void applyDiscount(int discountPercentage){
        discount=(discountPercentage/100D);
    }

    @Override
    public void getDiscountDetails(){
        System.out.println("Your got discount in you order, discount: "+discount);
    }

    @Override
    public void calculateTotalPrice(){
        System.out.println("Total price for your Order is: "+(price-discount));
    }

}


class NonVegItem extends FoodItem implements Discountable{
    NonVegItem(String itemName, double price, int quantity){
        super(itemName, price, quantity);
    }

    @Override 
    public void applyDiscount(int discountPercentage){
        discount=(discountPercentage/100D);
    }

    @Override
    public void getDiscountDetails(){
        System.out.println("Your got discount in you order, discount: "+discount);
    }

    @Override
    public void calculateTotalPrice(){
        System.out.println("Total price for your Order is: "+((price*quantity)-discount));
    }
    
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem foodItem1=new VegItem("Fried-Rice", 350, 3);
        FoodItem foodItem2=new NonVegItem("Biryani", 500, 2);

        foodItem1.getItemDetails();
        Discountable discountOnItem1= (Discountable) foodItem1;
        discountOnItem1.applyDiscount(10);// calculating discount on fooditem
        discountOnItem1.getDiscountDetails();
        foodItem1.calculateTotalPrice();
        System.out.println();

        foodItem2.getItemDetails();
        Discountable discountOnItem2=(Discountable) foodItem2;
        discountOnItem2.applyDiscount(12);
        discountOnItem2.getDiscountDetails();
        foodItem2.calculateTotalPrice();





    }
}
