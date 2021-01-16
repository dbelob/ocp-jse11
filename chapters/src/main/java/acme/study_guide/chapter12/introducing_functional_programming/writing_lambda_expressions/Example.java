package acme.study_guide.chapter12.introducing_functional_programming.writing_lambda_expressions;

class Animal {
}

class Duck {
    String quack() {
        return "quack!";
    }
}

interface Interface1 {
    Duck method();
}

interface Interface2 {
    String method(Duck duck);
}

interface Interface3 {
    String method(Animal animal, Duck duck);
}

public class Example {
    static void method1(Interface1 interface1) {
    }

    static void method2(Interface2 interface2) {
    }

    static void method3(Interface3 interface3) {
    }

    public static void main(String[] args) {
        method1(() -> new Duck());

        method2(d -> {
            return d.quack();
        });
        method2((Duck d) -> d.quack());

        method3((Animal a, Duck d) -> d.quack());
    }
}
