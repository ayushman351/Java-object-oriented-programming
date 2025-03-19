package hybrid_inheritance;

class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }
    
    void charge(){
        
    }
     
}

interface Refuelable {

    void refuel();

}

class ElectricVehicle extends Vehicle{
    ElectricVehicle(int maxSpeed, String model){
        super(maxSpeed, model);
    }

    @Override
    void charge(){
        System.out.println("This vehicle is getting charged!");
    }
    
}

class PertrolVehicle extends Vehicle implements Refuelable{
    PertrolVehicle(int maxSpeed, String model){
        super(maxSpeed, model);
    }
    @Override
    public void refuel(){
        System.out.println("This vehicle is getting refueled!");
    }

}
public class Problem2 {
    public static void main(String[] args) {
        Refuelable vehicle1=new PertrolVehicle(200, "Tata Harier");
        Vehicle vehicle2=new ElectricVehicle(180, "Tata Curve EV");

        vehicle1.refuel();
        vehicle2.charge();
    }
}
