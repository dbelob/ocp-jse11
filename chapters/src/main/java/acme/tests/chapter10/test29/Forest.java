package acme.tests.chapter10.test29;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Forest implements Serializable {
    public final int flora;
    public final List<String> fauna;

    public Forest() {
        this.flora = 5;
        this.fauna = new ArrayList<>();
    }

    public int getFlora() {
        return flora;
    }

    public List<String> getFauna() {
        return new ArrayList<>(fauna);
    }
}
