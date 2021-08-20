package acme.tests.chapter15.test01;

enum Season {
    SPRING(1), SUMMER(2), FALL(3), WINTER(4);

    private Season(int orderId) {
    }
}

public class PickApples {
    public static void main(String... orchard) {
        final Season s = Season.FALL;
        switch (s) {
            case FALL:
                System.out.println("Time to pick!");
            default:
                System.out.println("Not yet!");
        }
    }
}
