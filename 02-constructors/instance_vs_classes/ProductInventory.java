package instance_vs_classes;

class Product {
    String productName;
    double price;
    static private int totalProducts;

    Product(String name, double price){
        this.productName=name;
        this.price=price;
        totalProducts++;
    }

    void productDetails(){
        System.out.println("Product Name: "+productName+"\nPrice: "+price);
    }

    static void showTotalProducts( ){
        System.out.println("Total number of products are "+totalProducts);
    }
}
public class ProductInventory {
    public static void main(String[] args) {
        Product product1=new Product("Shampoo", 250);
        Product product2=new Product("Face Wash", 300);
        product1.productDetails();
        product2.productDetails();

        Product.showTotalProducts();
    }
}
