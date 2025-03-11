package Constructors;

class Book {
    String title;
    String author;
    double price;
    boolean availability= true;

    Book(String title, String author, double price){
         this.title=title;
         this.author=author;
         this.price=price;
    }

    void borrowBook(String title, int days){
        if(availability){
            System.out.println("Your borrowed "+title+" for "+days+" days.");
            this.availability=false;
        }else{
            System.out.println("This book is not available for days: "+days);
        }
        
    }

}
public class LibrarySystem {
    public static void main(String[] args) {
        Book book1=new Book("The wishing well", "Vivian Porter", 350);
        Book book2=new Book("The diary of a young girl", "Anne Frank", 400);

        book1.borrowBook(book1.title, 10);
        
    }
}
