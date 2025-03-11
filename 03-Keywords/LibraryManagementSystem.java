class Book {
    static String libraryName="University Library";
    String title;
    String author;
    final String isbn;
    
    Book(String title, String authour, String isbn){
        this.title=title;
        this.author=authour;
        this.isbn=isbn;
    }
    static void displayLibraryName(){
        System.out.println(libraryName);
    }

    void getBookDetails(Book book){
        if(book instanceof Book){
            System.out.println("Book Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("ISBN: "+isbn);
            System.out.println();
        }
    }

}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1=new Book("Java Programming", "RK", "1234-2412-213121");
        book1.getBookDetails(book1);
        Book.displayLibraryName();
    }
}
