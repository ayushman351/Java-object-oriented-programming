package single_inheritance;


class Device {
    int deviceId;
    String status;

    Device(int deviceId, String status){
        this.deviceId=deviceId;
        this.status=status;
    }

    void displayDetatils(){
        System.out.println("Device ID: "+deviceId+", Status: "+status);
    }


}

class Thermostat extends Device{
    double temperatureSetting;

    Thermostat(double temperatureSetting, int deviceId, String status){
        super(deviceId, status);
        this.temperatureSetting=temperatureSetting;
    }

    void displayStatus(){
        super.displayDetatils();
        System.out.println("Temperature setting: "+temperatureSetting);
    }

}
public class Problem2 {
    public static void main(String[] args) {
        Thermostat thermostat=new Thermostat(25, 1021, "ON");

        thermostat.displayStatus();
        
    }
    
}
