package acme.tests.chapter03.test59;

interface Building {
    default Double getHeight() { return 1.0; }         // m1
}
interface Office {
    public default String getHeight() { return null; } // m2
}
//abstract class Tower implements Building, Office {}   // m3
//public class Restaurant extends Tower {}              // m4
