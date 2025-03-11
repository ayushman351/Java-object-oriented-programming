package Constructors;

class Book{
    String title;
    String author;
    double price;

    Book(){

    }
    Book(String title, String name, double price){
        this.title=title;
        this.author=name;
        this.price=price;

    }


}
public class BookDetails {
public static void main(String[] args) {
    Book book1=new Book();
    book1.title="Atomic habbits";
    book1.author="James clear";
    book1.price=500;
    System.out.println(book1.author);
    Book book2=new Book("Deep work", "Cal Newport", 450);
    System.out.println(book2.author);


}
    
}