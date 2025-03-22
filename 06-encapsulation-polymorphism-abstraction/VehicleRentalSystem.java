abstract class Vehicle {
    String vehicleNumber;
    String type;
    double rentalRate;
    private double insuranceRate; // % of the rental rate
    private double insuranceCost;

    Vehicle(String vehicleNumber, String type, double rentalRate, double insuranceRate){
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
        this.insuranceRate=insuranceRate/100.0;
    }

   public double getInsuranceRate() {// method to access insurance rate
       return insuranceRate;
   }

    public double getInsuranceCost() {// method to access in insurance cost
        return insuranceCost;
    }

    public void setInsuranceCost(double insuranceCost) {// method to modify insurance cost
        this.insuranceCost = insuranceCost;
    }

    abstract void calculateRentalCost(int days);
    
}


interface Insurable{
    void calculateInsurance();
    void getInsuranceDetails();
}


class Car extends Vehicle implements Insurable{
    Car(String vehicleNumber, String type, double rentalRate, double insuranceRate){
        super(vehicleNumber, type,rentalRate,insuranceRate);
    }
    @Override
    public void calculateInsurance() {
      double insuranceCost=(getInsuranceRate()+rentalRate);
      setInsuranceCost(insuranceCost);
    }
    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance cost per day: "+getInsuranceCost());
    }
    @Override
    public void calculateRentalCost(int days){
        System.out.println("Rental cost of " + vehicleNumber + " " + type + 
        " for " + days + " days is: insurance cost + rental rate = " + 
        getInsuranceCost() + " + " + rentalRate + " = " + (getInsuranceCost() + rentalRate));

    }
}


class Bike extends Vehicle implements Insurable {
    Bike(String vehicleNumber, String type, double rentalRate, double insuranceRate){
        super(vehicleNumber, type,rentalRate,insuranceRate);
    }
    @Override
    public void calculateInsurance() {
      double insuranceCost=(getInsuranceRate()+rentalRate);
      setInsuranceCost(insuranceCost);
    }
    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance cost per day: "+getInsuranceCost());
    }
    @Override
    public void calculateRentalCost(int days){
        System.out.println("Rental cost of " + vehicleNumber + " " + type + 
        " for " + days + " days is: insurance cost + rental rate = " + 
        getInsuranceCost() + " + " + rentalRate + " = " + (getInsuranceCost() + rentalRate));

    }
}


class Truck extends Vehicle implements Insurable {
    Truck(String vehicleNumber, String type, double rentalRate, double insuranceRate){
        super(vehicleNumber, type,rentalRate,insuranceRate);
    }
    @Override
    public void calculateInsurance() {
      double insuranceCost=(getInsuranceRate()+rentalRate);
      setInsuranceCost(insuranceCost);
    }
    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance cost per day: "+getInsuranceCost());
    }
    @Override
    public void calculateRentalCost(int days){
        System.out.println("Rental cost of " + vehicleNumber + " " + type + 
        " for " + days + " days is: insurance cost + rental rate = " + 
        getInsuranceCost() + " + " + rentalRate + " = " + (getInsuranceCost() + rentalRate));
    }
}


public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle vehicle1=new Car("CH4503", "Car", 1000, 15);
        Vehicle vehicle2=new Bike("PB3268", "MotorCycle", 500, 10);
        Vehicle vehicle3=new Truck("HR7769", "Truck", 2500, 20);

        Insurable insuranceOfVehicle1=(Insurable)vehicle1;
        insuranceOfVehicle1.calculateInsurance();
        insuranceOfVehicle1.getInsuranceDetails();
        vehicle1.calculateRentalCost(10);
        System.out.println();

        Insurable insuranceOfVehicle2=(Insurable)vehicle2;
        insuranceOfVehicle2.calculateInsurance();
        insuranceOfVehicle2.getInsuranceDetails();
        vehicle2.calculateRentalCost(10);
        System.out.println();

        Insurable insuranceOfVehicle3=(Insurable)vehicle3;
        insuranceOfVehicle3.calculateInsurance();
        insuranceOfVehicle3.getInsuranceDetails();
        vehicle3.calculateRentalCost(10);
    }
}
