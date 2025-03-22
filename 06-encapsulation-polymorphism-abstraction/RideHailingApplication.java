abstract class Vehicle {
   private String vehicleId;
   private String driver;
   private double ratePerKm;
   private String location;


    Vehicle(String vehicleId, String driver, double ratePerKm){
        this.vehicleId=vehicleId;
        this.driver=driver;
        this.ratePerKm=ratePerKm;
    }
    
    // method to get ratePerKm
    public double getRatePerKm() {
        return ratePerKm;
    }

    //methods to get and set location
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    // method to show vehicle details
    public void getVehicleDetails(){
        System.out.println("Vehicle ID: "+vehicleId+", Driver: "+driver+", rate per km: "+ratePerKm);
    }


    //method to calculate fare
    abstract void calculateFare(double distance);
}


interface GPS {
    void getCurrentLocation();
    void updateLocation(String location);
}

class Car extends Vehicle implements GPS {
    Car(String vehicleId, String driver, double ratePerKm){
        super(vehicleId, driver, ratePerKm);
    }
    
    // method to calculate fare
    @Override
    void calculateFare(double distance) {
        System.out.println("Your fare for distance "+distance+" km will be: "+(distance*getRatePerKm()));
    }
    
    //method to see current location
    @Override
    public void getCurrentLocation() {
        System.out.println("Current location of your vehicle is: "+getLocation());
    }

    //method to update location
    @Override
    public void updateLocation(String location) {
        setLocation(location);
        System.out.println("Location updated: "+location);
    }
}


class Bike extends Vehicle implements GPS{
    Bike(String vehicleId, String driver, double ratePerKm){
        super(vehicleId, driver, ratePerKm);
    }
    
    // method to calculate fare
    @Override
    void calculateFare(double distance) {
        System.out.println("Your fare for distance "+distance+" km will be: "+(distance*getRatePerKm()));
    }
    
    //method to see current location
    @Override
    public void getCurrentLocation() {
        System.out.println("Current location of your vehicle is: "+getLocation());
    }

    //method to update location
    @Override
    public void updateLocation(String location) {
        setLocation(location);
        System.out.println("Location updated: "+location);
    }
}


class Auto extends Vehicle implements GPS {
    Auto(String vehicleId, String driver, double ratePerKm){
        super(vehicleId, driver, ratePerKm);
    }
    
    // method to calculate fare
    @Override
    void calculateFare(double distance) {
        System.out.println("Your fare for distance "+distance+" km will be: "+(distance*getRatePerKm()));
    }
    
    //method to see current location
    @Override
    public void getCurrentLocation() {
        System.out.println("Current location of your vehicle is: "+getLocation());
    }

    //method to update location
    @Override
    public void updateLocation(String location) {
        setLocation(location);
        System.out.println("Location updated: "+location);
    }
}


public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle car=new Car("CH7693", "Morris", 30.0);
        Vehicle bike=new Bike("PB2956", "Martin", 15.0);
        Vehicle auto=new Auto("HR6849", "Justin", 20.0);

        car.getVehicleDetails();
        car.calculateFare(50.0);
        GPS gpsOfCar=(GPS)car;
        gpsOfCar.getCurrentLocation();
        gpsOfCar.updateLocation("2 km away");
        System.out.println();

        bike.getVehicleDetails();
        bike.calculateFare(40.0);
        GPS gpsOfBike=(GPS)bike;
        gpsOfBike.getCurrentLocation();
        gpsOfBike.updateLocation("3 km away");
        System.out.println();

        auto.getVehicleDetails();
        auto.calculateFare(50.0);
        GPS gpsOfAuto=(GPS)auto;
        gpsOfAuto.getCurrentLocation();
        gpsOfAuto.updateLocation("5 km away");
        
    }
}
