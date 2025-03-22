abstract class Product {
    private int productId;
    private double price;
    String name;
    double discount;
    int taxPercentage=5;
    double tax;
    
    Product(int productId, double price, String name){
        this.productId=productId;
        this.price=price;
        this.name=name;
    }

    double getPrice(){
        return price;
    }
    
    int getProductId(){
        return productId;
    }

    abstract void calculateDiscount();
    void finalPrice(){}
    void displayOrderDetails(){
    }
}


interface Taxable {

    void calculateTax();
    void getTaxDetails();
}


class Electronics extends Product implements Taxable {
    int discountPercentage=20;

    Electronics(int productId, double price, String name){
        super(productId, price, name);
    }

    @Override
    public void calculateDiscount() {
        this.discount=(discountPercentage/100D)*getPrice();
        System.out.println("Discount on your product: "+discount);
    }

    @Override
    public void calculateTax(){
        this.tax=(taxPercentage/100D)*getPrice();
    }

    @Override
    public void getTaxDetails(){
        System.out.println("The tax on your product is: "+tax);
    }

    @Override
    public void finalPrice(){
        System.out.println("The final price you have to pay for your "+name+" is: "+(getPrice()+tax-discount));
    }

    @Override
    public void displayOrderDetails(){
        System.out.println("All the details about your product: ");
        System.out.println("Product id: "+getProductId()+", Name: "+name+", price: "+getPrice());
        calculateDiscount();
        calculateTax();
        getTaxDetails();
        finalPrice();
        System.out.println();
    }
}


class Clothing extends Product implements Taxable{
    int discountPercentage=25;
    Clothing(int productId, double price, String name){
        super(productId, price, name);
    }

    @Override
    public void calculateDiscount(){
        this.discount=(discountPercentage/100D)*getPrice();
        System.out.println("Discount on your product: "+discount);
    }
    @Override
    public void calculateTax(){
        this.tax=(taxPercentage/100D)*getPrice();
    }

    @Override
    public void getTaxDetails(){
        System.out.println("The tax on your product is: "+tax);
    }

    @Override
    public void finalPrice(){
        System.out.println("The final price you have to pay for your "+name+" is: "+(getPrice()+tax-discount));
    }

    public void displayOrderDetails(){
        System.out.println("All the details about your product: ");
        System.out.println("Product id: "+getProductId()+", Name: "+name+", price: "+getPrice());
        calculateDiscount();
        calculateTax();
        getTaxDetails();
        finalPrice();
        System.out.println();
    }
}


class Groceries extends Product implements Taxable {
    int discountPercentage=15;

    Groceries(int productId, double price, String name){
        super(productId, price, name);
    }

    @Override
    public void calculateDiscount(){
        this.discount=(discountPercentage/100D)*getPrice();
        System.out.println("Discount on your product: "+discount);
    }

    @Override
    public void calculateTax(){
        this.tax=(taxPercentage/100D)*getPrice();
    }

    @Override
    public void getTaxDetails(){
        System.out.println("The tax on your product is: "+tax);
    }

    @Override
    public void finalPrice(){
        System.out.println("The final price you have to pay for your "+name+" is: "+(getPrice()+tax-discount));
    }

    public void displayOrderDetails(){
        System.out.println("All the details about your product: ");
        System.out.println("Product id: "+getProductId()+", Name: "+name+", price: "+getPrice());
        calculateDiscount();
        calculateTax();
        getTaxDetails();
        finalPrice();
        System.out.println();
    }

}


public class EcommercePlatform {
    public static void main(String[] args) {
        Product product1=new Electronics(111, 40000, "Smart Phone");
        Product product2=new Clothing(211, 5000, "White-Shirt");
        Product product3=new Groceries(311, 250, "Coffee");

        // product1.calculateDiscount();
        // Taxable taxOnProduct1=(Taxable)product1;
        // taxOnProduct1.calculateTax();
        // taxOnProduct1.getTaxDetails();
        // product1.finalPrice();
        // System.out.println();

        // product2.calculateDiscount();
        // Taxable taxOnProduct2=(Taxable)product2;
        // taxOnProduct2.calculateTax();
        // taxOnProduct2.getTaxDetails();
        // product2.finalPrice();
        // System.out.println();

        // product3.calculateDiscount();
        // Taxable taxOnProduct3=(Taxable)product3;
        // taxOnProduct3.calculateTax();
        // taxOnProduct3.getTaxDetails();
        // product3.finalPrice();

        product1.displayOrderDetails();
        product2.displayOrderDetails();
        product3.displayOrderDetails();

    }
}
