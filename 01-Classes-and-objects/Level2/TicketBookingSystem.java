package Level2;

public class TicketBookingSystem {
    public static void main(String[] args) {

        MovieTicket ticket1=new MovieTicket("John Wick", 15, 550);
        
        ticket1.bookTicket();
        ticket1.ticketDetails();
        
    }
}

class MovieTicket{
    String movieName;
    int seatNum;
    double price;
    boolean isSeatAssigned=false;

    MovieTicket(String movieName, int seatNum, double price){
        this.movieName=movieName;
        this.price=price;
        this.seatNum=seatNum;
    }

    void bookTicket(){
        this.isSeatAssigned=true;
    }
    
    void ticketDetails(){
        if(isSeatAssigned){
        System.out.println("Your ticket details are:");
        System.out.println("Movie name: "+movieName+"\nTicket price: "+price+"\nSeat number: "+seatNum);
        }else{
            System.out.println("Your ticket is not booked!");
        }
       
    }

}
