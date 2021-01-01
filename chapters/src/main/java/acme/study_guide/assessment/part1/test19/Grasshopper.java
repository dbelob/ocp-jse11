package acme.study_guide.assessment.part1.test19;

public class Grasshopper {
    public Grasshopper(String n) {
        name = n;
    }

    public static void main(String[] args) {
        Grasshopper one = new Grasshopper("g1");
        Grasshopper two = new Grasshopper("g2");
        one = two;
        two = null;
        one = null;
    }

    private String name;
}
