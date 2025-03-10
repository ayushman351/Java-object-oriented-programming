package Level1;
public class BookDetails {
    public static void main(String[] args) {

        Book book=new Book("Atomic Habbits", 500, "James Clear");
        book.displayBookDetatils();
        
    }
}
class Book{
    String title;
    double price;
    String author;

    Book(String title, double price, String author){
        this.title=title;
        this.price=price;
        this.author=author;
    }

    void displayBookDetatils(){
        System.out.println("Title: "+title+", Price: "+price+", Author: "+author);
    }
}