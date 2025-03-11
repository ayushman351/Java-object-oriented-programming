package instance_vs_classes;


class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee=1000;

Vehicle(String owner, String type){
    this.ownerName=owner;
    this.vehicleType=type;
}

void vehicleDetails(){
    System.out.println("Owner: "+ownerName+"\n Vehicle Type: "+vehicleType);
}


static void updateFee(double fee){
    Vehicle.registrationFee=fee;
    System.out.println("Registration fees updated: "+fee);
}
}
public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("Shashikant ", "4-Wheeler");
        Vehicle vehicle2=new Vehicle("Jaykant", "3-Wheeler");

        vehicle.vehicleDetails();
        vehicle2.vehicleDetails();

        Vehicle.updateFee(2000);

    }
}
