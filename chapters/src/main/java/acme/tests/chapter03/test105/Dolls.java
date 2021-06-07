package acme.tests.chapter03.test105;

public class Dolls {
//    public int num() {
//        return 3.0;
//    }

//    public int size() {
//        return 5L;
//    }

    public void nested() {
        nested(2, true);
    }

    public int nested(int w, boolean h) {
        return 0;
    }

    public int nested(int level) {
        return level + 1;
    }

    public static void main(String[] outOfTheBox) {
//        System.out.print(new Dolls().nested());
    }
}
