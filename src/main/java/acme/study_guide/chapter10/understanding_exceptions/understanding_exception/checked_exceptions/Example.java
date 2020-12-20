package acme.study_guide.chapter10.understanding_exceptions.understanding_exception.checked_exceptions;

import java.io.IOException;

public class Example {
    void fall1(int distance) throws IOException {
        if (distance > 10) {
            throw new IOException();
        }
    }

    void fall2(int distance) {
        try {
            if (distance > 10) {
                throw new IOException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
