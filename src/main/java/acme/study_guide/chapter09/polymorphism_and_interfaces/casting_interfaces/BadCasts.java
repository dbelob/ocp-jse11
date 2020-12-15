package acme.study_guide.chapter09.polymorphism_and_interfaces.casting_interfaces;

interface Canine {
}

class Dog implements Canine {
}

class Wolf implements Canine {
}

public class BadCasts {
    public static void main(String[] args) {
        Canine canine = new Wolf();
        Canine badDog = (Dog) canine;
    }
}
