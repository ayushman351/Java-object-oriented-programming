package single_inheritance;


class Book {
    String title;
    int publicationYear;
    
    Book(String title, int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }

    void displayInfo(){
        System.out.println("Title: "+title+", Publication year: "+publicationYear);
    }
    
}

class Author extends Book {
    String name;
    String bio;

    Author(String name, String bio,String title, int publicationYear){
        super(title, publicationYear);
        this.name=name;
        this.bio=bio;

    }

    void displayInfo(){
        super.displayInfo();
        System.out.println("Name: "+name+", Bio: "+bio);
    }



}

public class Problem1 {
    public static void main(String[] args) {
        Book book=new Book("To kill a mockingbird", 1960);
        Author author=new Author("Harpee Lee", "American writer famous for themes of justice and morality.", "To kill a mockingbird", 1960);
        Book book2=new Author("J.R.R. Tolkien","British author famous for fantasy and mythology.","The Hobbit",1937);

        book.displayInfo();
        author.displayInfo();
        book2.displayInfo();
    }
    
}
