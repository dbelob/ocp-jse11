package acme.enthuware.standard_tests.test2.test23;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
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
        var books = List.of(new Book("The Outsider", 2.99), new Book("Where the Crawdads Sing", 4.99),
                new Book("Elevation", 2.99), new Book("Coffin from Hong Kong", 1.99));
        Stream<Book> bkStrm = books.stream();//

        double total = bkStrm.map(b -> b.getPrice()).reduce(0.0, (a, b) -> {return a + b;}); //1
        System.out.println(total);

//        double total1 = bkStrm.map(b->b.getPrice()).reduce((a, b)->{ return a+b;}).ifPresent(p->p.doubleValue());
        double total1 = books.stream().map(b->b.getPrice()).reduce((a, b)->{ return a+b;}).orElse(0D);
        System.out.println(total1);

        DoubleBinaryOperator dbo =(a, b)->a+b;
        double total2 = books.stream().mapToDouble(b->b.getPrice()).reduce(0.0, dbo);
        System.out.println(total2);
    }
}
