package acme.tests.chapter03.test033;

public class Penguin {
    enum Baby {EGG}

    static class Chick {
        enum Baby {EGG}
    }

    public static void main(String[] args) {
        boolean match = false;
        Baby egg = Baby.EGG;
        switch (egg) {
            case EGG:
                match = true;
        }
    }
}
