package acme.enthuware.standard_tests.test1.test04;


import java.util.List;

//interface Reader{
//    void read(Book b);
//    default void unread(Book b){}
//}

interface Reader{
    default void read(Book b){ }
    void unread(Book b);
}

public class Book {
    private String title;
    private String genre;
    public Book(String title, String genre){
        this.title = title; this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Gone with the wind", "Fiction"),
                new Book("Bourne Ultimatum", "Thriller"),
                new Book("The Client", "Thriller")
        );

        Reader r = b->{
            System.out.println("Reading book "+b.getTitle());
        };
        books.forEach(x->r.read(x));
    }
}
