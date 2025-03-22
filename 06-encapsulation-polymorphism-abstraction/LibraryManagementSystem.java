abstract class LibraryItem{
    String itemId;
    String title;
    String author;
    private boolean isAvailable=true;
    private boolean isReserved=false;
    

    LibraryItem(String itemId, String title, String author){
        this.itemId=itemId;
        this.author=author;
        this.title=title;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public boolean getIsAvialable(){
        return isAvailable;
    }

    public void setReserved(boolean isReserved) {
        this.isReserved = isReserved;
    }
    public boolean getReserved(){
        return isReserved;
    }
    
    abstract void getLoanDuration();
    
    // method to print item details
    public void getItemDetails(){
        System.out.println("Item ID: "+itemId+", Title: "+title+", Author: "+author);
    }
}

interface Reservable {
    void reserveItem(String userId);
    void checkAvailability();
}


class Book extends LibraryItem implements Reservable{
    String loanDuration="14 days";

    Book(String itemId, String title, String author){
        super(itemId, title, author);
    }
    
    // method to check loan duration
    @Override
    void getLoanDuration() {
        System.out.println("Loan duration for this Item is: "+loanDuration);
    }
    //method to reserve item
    @Override
    public void reserveItem(String userId) {
        if(getIsAvialable()){
            System.out.println("Can not reserve this Item as it's already available, borrow if required!");
        }else{
            if(getReserved()){
                System.out.println("Item already reserved!");
            }else{
                setReserved(true);
                System.out.println("Item reversed for: "+userId);
            }
        }
    }
    // method to check availability
    @Override
    public void checkAvailability() {
        if(getIsAvialable()==false){
            System.out.println("This Item is currently not available!");
        }else if(getReserved()){
            System.out.println("This item is on hold!");
        }else{
            setIsAvailable(false);
            System.out.println("You borrowed This item for "+loanDuration);
        }
    }
}


class DVD extends LibraryItem implements Reservable{
    String loanDuration="3 days";

    DVD(String itemId, String title, String author){
        super(itemId, title, author);
    }

    // method to check loan duration
    @Override
    void getLoanDuration() {
        System.out.println("Loan duration for this Item is: "+loanDuration);
    }
    
    // method to reserve Item
    public void reserveItem(String userId) {
        if(getIsAvialable()){
            System.out.println("Can not reserve this Item as it's already available, borrow if required!");
        }else{
            if(getReserved()){
                System.out.println("Item already reserved!");
            }else{
                setReserved(true);
                System.out.println("Item reversed for: "+userId);
            }
        }
    }
    // method to check availability
    @Override
    public void checkAvailability() {
        if(getIsAvialable()==false){
            System.out.println("This Item is currently not available!");
        }else if(getReserved()){
            System.out.println("This item is on hold!");
        }else{
            setIsAvailable(false);
            System.out.println("You borrowed This item for "+loanDuration);
        }
    }
}


class Magazine extends LibraryItem implements Reservable {
    String loanDuration="7 days";

    Magazine(String itemId, String title, String author){
        super(itemId, title, author);
    }

    // method to check loan duration
    @Override
    void getLoanDuration() {
        System.out.println("Loan duration for this Item is: "+loanDuration);
    }
    
    //method to reserve item
    public void reserveItem(String userId) {
        if(getIsAvialable()){
            System.out.println("Can not reserve this Item as it's already available, borrow if required!");
        }else{
            if(getReserved()){
                System.out.println("Item already reserved!");
            }else{
                setReserved(true);
                System.out.println("Item reversed for: "+userId);
            }
        }
    }
    // method to check availability
    @Override
    public void checkAvailability() {
        if(getIsAvialable()==false){
            System.out.println("This Item is currently not available!");
        }else if(getReserved()){
            System.out.println("This item is on hold!");
        }else{
            setIsAvailable(false);
            System.out.println("You borrowed This item for "+loanDuration);
        }
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book=new Book("B111", "Atomic Habits", "James Clear");
        LibraryItem magazine=new Magazine("M124", "Time Magazine", "Various");
        LibraryItem dvd=new DVD("D327", "Inception", "Christopher Nolan");

        book.getItemDetails();
        book.getLoanDuration();
        Reservable reservableBook=(Reservable)book;
        reservableBook.reserveItem("user121");
        reservableBook.checkAvailability();
        System.out.println();

        magazine.getItemDetails();
        magazine.getLoanDuration();
        Reservable reservableMag=(Reservable)magazine;
        reservableMag.reserveItem("user666");
        reservableMag.checkAvailability();
        System.out.println();
        
        dvd.getItemDetails();
        dvd.getLoanDuration();
        Reservable reservableDvd=(Reservable)dvd;
        reservableDvd.reserveItem("user374");
        reservableDvd.checkAvailability();        
    }
}
