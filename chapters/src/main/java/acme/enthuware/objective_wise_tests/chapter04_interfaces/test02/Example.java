package acme.enthuware.objective_wise_tests.chapter04_interfaces.test02;

import java.util.List;
import java.util.stream.Stream;

class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

public class Example {
    public static void main(String[] args) {
        //using title, price constructor to create Book instances
        var books = List.of(new Book("The Outsider", 2.99), new Book("Where the Crawdads Sing", 4.99 ),
                new Book("Elevation", 2.99), new Book("Coffin from Hong Kong", 1.99) );
        Stream<Book> bkStrm = books.stream();//

        double total = bkStrm.map(b->b.getPrice()).reduce(0.0, (a, b)->{ return a+b;}); //1

        // Assuming appropriate constructor and methods, which of the following options are equivalent to the statement at //1 of the above code?
    }
}
