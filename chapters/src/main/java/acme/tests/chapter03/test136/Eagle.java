package acme.tests.chapter03.test136;

interface CanFly {
    public void fly();  // {}
}
/* final */ class Bird {
    public int fly(int speed) { return  42; }
}
public class Eagle extends Bird implements CanFly {
    public void fly() {}
}
