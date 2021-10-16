package acme.enthuware.standard_tests.test2.test56;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Book {
    private int id;
    private String title;
    private String genre;
    private String author;
    private double price;

    public Book(String title, String genre, String author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("There is a hippy on the highway", "Thriller", "James Hadley Chase"),
                new Book("Coffin from Hongkong", "Thriller", "James Hadley Chase"),
                new Book("The Client", "Thriller", "John Grisham"),
                new Book("Gone with the wind", "Fiction", "Margaret Mitchell")
        );
        Map<String, Map<String, List<Book>>> classified = null;
        classified = books.stream().collect(Collectors.groupingBy(
                //x->x.getGenre(), Collectors.groupingBy(x->x.getAuthor()) //this is fine as well.
                Book::getGenre, Collectors.groupingBy(Book::getAuthor)
        ));

        System.out.println(classified);
    }
}
