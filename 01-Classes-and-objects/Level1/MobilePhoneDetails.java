package Level1;
public class MobilePhoneDetails {
    public static void main(String[] args) {
        MobilePhone mobile1=new MobilePhone("Samsung ","Galaxy A15", 30000);
        MobilePhone mobile2=new MobilePhone("Apple", "iphone16", 80000);
        MobilePhone mobile3=new MobilePhone("OnePlus", "12R", 45000);

        mobile1.showDetails();
        mobile2.showDetails();
        mobile3.showDetails();
        
    }
}
class MobilePhone{
    String brand;
    String model;
    double price;

    MobilePhone(String brandName, String model,double price){
        brand=brandName;
        this.model=model;
        this.price=price;
    }

    void showDetails(){
        System.out.println("Brand name: "+brand+", model: "+this.model+", price: "+price);
    }
}
