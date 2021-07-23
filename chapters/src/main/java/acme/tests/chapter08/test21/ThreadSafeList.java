package acme.tests.chapter08.test21;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeList {
    private List<Integer> data = new ArrayList<>();

    public synchronized void addValue(int value) {
        data.add(value);
    }

    public int getValue(int index) {
        return data.get(index);
    }

    public int size() {
        synchronized (ThreadSafeList.class) {
            return data.size();
        }
    }
}
