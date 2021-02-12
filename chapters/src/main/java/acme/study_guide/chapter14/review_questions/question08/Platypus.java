package acme.study_guide.chapter14.review_questions.question08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Platypus {
    String name;
    int beakLength;

    public Platypus(String name, int beakLength) {
        this.name = name;
        this.beakLength = beakLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(int beakLength) {
        this.beakLength = beakLength;
    }

    public String toString() {
        return "" + beakLength;
    }

    public static void main(String[] args) {
        Platypus p1 = new Platypus("Paula", 3);
        Platypus p2 = new Platypus("Peter", 5);
        Platypus p3 = new Platypus("Peter", 7);

        List<Platypus> list = Arrays.asList(p1, p2, p3);

        // A
        Collections.sort(list, Comparator.comparing(Platypus::getBeakLength));

        // B
        Collections.sort(list, Comparator.comparing(Platypus::getBeakLength).reversed());

        // C
        Collections.sort(list, Comparator.comparing(Platypus::getName)
                .thenComparing(Platypus::getBeakLength));

        // D
        Collections.sort(list, Comparator.comparing(Platypus::getName)
                .thenComparing(
                        Comparator.comparing(Platypus::getBeakLength)
                                .reversed()));

        // E
//        Collections.sort(list, Comparator.comparing(Platypus::getName)
//                .thenComparingNumber(Platypus::getBeakLength)
//                .reversed());

        // F
        Collections.sort(list, Comparator.comparing(Platypus::getName)
                .thenComparingInt(Platypus::getBeakLength)
                .reversed());

        System.out.println(list);
    }
}
