package acme.tests.chapter03.test149;

abstract class Book {
    protected static String material = "papyrus";
    public Book() {}
    abstract String read(); // {}
    public Book(String material) {this.material = material;}
}

public class Encyclopedia extends Book {
    public static String material = "cellulose";
    public Encyclopedia() {super();}
    public String read() { return "Reading is fun!"; }
    public String getMaterial() {return super.material;}

    public static void main(String[] pages) {
        System.out.print(new Encyclopedia().read());
        System.out.print("-" + new Encyclopedia().getMaterial());
    }
}
