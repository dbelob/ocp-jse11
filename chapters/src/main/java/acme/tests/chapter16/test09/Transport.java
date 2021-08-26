package acme.tests.chapter16.test09;

import java.util.Collection;

public class Transport {
    static interface Vehicle {
    }

    static class Bus implements Vehicle {
    }

    public static void main(String[] args) {
        Bus bus = new Bus();

        System.out.println(null instanceof Bus);
        System.out.println(bus instanceof Vehicle);
        System.out.println(bus instanceof Bus);
//               System.out.println(bus instanceof ArrayList);
        System.out.println(bus instanceof Collection);
    }
}
