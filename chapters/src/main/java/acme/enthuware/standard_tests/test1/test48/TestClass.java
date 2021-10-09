package acme.enthuware.standard_tests.test1.test48;

import java.util.function.Supplier;

public class TestClass {
    public static void main(String[] args) {
        int value = 0;
//        Supplier<Integer> valueS = () -> value++; //1
        value++;//2
//        System.out.println(value + " " + valueS.get()); //3
    }
}
