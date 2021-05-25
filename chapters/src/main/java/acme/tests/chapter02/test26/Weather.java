package acme.tests.chapter02.test26;

enum Season {SPRING, SUMMER, WINTER, FALL}

public class Weather {
    public int getAverageTemperate(Season s) {
        switch (s) {
            default:
            case FALL:
                return 30;
        }
    }
}
