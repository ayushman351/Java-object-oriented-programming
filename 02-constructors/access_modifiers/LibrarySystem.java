package access_modifiers;

class Book{
    public String ISBN;
    protected String title;
    private String author;

    Book(String isbn,String title){
        this.ISBN=isbn;
        this.title=title;
    }

    void setName(String name){
        this.author=name;
    }
    String getName(){
        return author;
    }
}

class Ebook extends Book {
    Ebook(String isbn, String title){
        super(isbn, title);
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Book book1=new Book("123-241-12123","The wishing well");
        book1.setName(
            "Vivian Porter"
        );

        Ebook ebook1=new Ebook("924-231-12422","The journey to the west");
        System.out.println(ebook1.ISBN);
        System.out.println(ebook1.title);
    }
}
