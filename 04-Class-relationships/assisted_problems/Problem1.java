package assisted_problems;
// understanding aggregation relation
import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author){
        this.title=title;
        this.author=author;
    }
}
class Library{
    ArrayList<Book> books=new ArrayList<>();
    void addBook(Book book){
        books.add(book);
    }
    // // void showBooks(){
    // //     for(int i=0;i<books.size();i++){
    // //         System.out.println(books.get(i));
    // //     }
    // }
    
}

public class Problem1 {

    public static void main(String[] args) {
        Library library=new Library();
        Library library2=new Library();


        // creating books
        Book book1=new Book("Atomic Habbits", "James Clear");
        Book book2=new Book("The Power of habbit", "Charles Duhigg");

        // adding books to library   
        library.addBook(book1);
        library.addBook(book2);
        // library.showBooks();
        
        library2.addBook(book2);
        // library2.showBooks();
        System.out.println();
        System.out.println(library.books.get(0).title);
        System.out.println(library2.books.get(0).title);

    }
}


