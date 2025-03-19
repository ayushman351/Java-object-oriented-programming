package assisted_problems;


class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType){
        this.fuelType=fuelType;
        this.maxSpeed=maxSpeed;
    }

    void showDetails(){
        System.out.println("Max speed: "+maxSpeed+", fuel type: "+fuelType);
    }
}

class Car extends Vehicle{
    int seatCapacity;

    Car(int seatCapacity, int maxSpeed, String fuelType){
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }

    void showDetails(){
        System.out.println("Max speed: "+maxSpeed+" Km/h, fuel type: "+fuelType+", Seat capacity: "+seatCapacity);
    }

}

class Motorcycle extends Vehicle{
    double price;

    Motorcycle(double price, int maxSpeed, String fuelType){
        super(maxSpeed, fuelType);
        this.price=price;
    }

    void showDetails(){
        System.out.println("Max speed: "+maxSpeed+" Km/h, fuel type: "+fuelType+", Price: "+price);
    }

}

class Truck extends Vehicle{
    double loadCapacity;

    Truck(double loadCapacity, int maxSpeed, String fuelType){
        super(maxSpeed, fuelType);
        this.loadCapacity=loadCapacity;
    }

    void showDetails(){
        System.out.println("Max speed: "+maxSpeed+" Km/h, fuel type: "+fuelType+", load capacity: "+loadCapacity+" kg");
    }

}
public class Problem3 {
    public static void main(String[] args) {
        // Vehicle vehicle1=new Car(5, 180, "CNG");
        // Vehicle vehicle2=new Motorcycle(150000, 140, "Petrol");
        // Vehicle vehicle3=new Truck(25000, 100, "Diesel");

        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=new Car(5, 180, "CNG");
        vehicles[1]=new Motorcycle(155000, 140, "Petrol");
        vehicles[2]=new Truck(25000, 100, "Diesel");

        for(int i=0;i<vehicles.length;i++){
            vehicles[i].showDetails();
        }

        

        // vehicle1.showDetails();
        // vehicle2.showDetails();
        // vehicle3.showDetails();
    }
}
