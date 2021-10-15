package acme.enthuware.standard_tests.test2.test28;

import java.util.function.*;
class Employee{
    int age;
}

public class TestClass{

    public static void main(String[] args) {
        Employee e = new Employee();
        Supplier<Employee> se = ()->{ e.age = 40; return e; }; //1
        e.age = 50;//2
        System.out.println(se.get().age); //3
    }
}
