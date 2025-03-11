package Constructors;

class HotelBooking{
    String guestName;
    String roomType;
    int nights;

    HotelBooking(){
        this("New Guest", "Basic", 1);
    }
    HotelBooking(String guestName, String roomType, int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
}

public class HotelBookingSystem {
    public static void main(String[] args) {
        HotelBooking booking1=new HotelBooking("John Wick", "Special suite",5);
        HotelBooking booking2=new HotelBooking();
        System.out.println(booking1.roomType);
        System.out.println(booking2.roomType);

        
    }
}
