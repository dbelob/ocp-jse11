package acme.tests.chapter09.test36;

import java.io.Serializable;

class Bowl {
    boolean spoon = true;
    // Getters/Setters Omitted
}

public class Cereal implements Serializable {
    private String name = "CocoaCookies";
    private transient int sugar = 10;
    private Bowl bowl;

    public Cereal() {
        super();
        this.name = "CaptainPebbles";
        this.bowl = new Bowl();
        sugar = 2;
    }
    { name = "SugarPops"; }
    // Getters/Setters Omitted
}
