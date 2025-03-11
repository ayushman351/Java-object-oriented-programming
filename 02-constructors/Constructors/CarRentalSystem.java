package Constructors;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(String name, String model, int days){
        this.customerName=name;
        this.carModel=model;
        this.rentalDays=days;
    }

    void totalCost(){
        System.out.println("Your total cost for booking "+this.carModel+" for "+this.rentalDays+" days is "+"$"+this.rentalDays*100);
    }

}
public class CarRentalSystem {
    public static void main(String[] args) {
        CarRental rentCar=new CarRental("Sanjay Singhania", "Tata Harrier", 15);

        rentCar.totalCost();
    }
}
