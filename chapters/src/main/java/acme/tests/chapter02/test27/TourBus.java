package acme.tests.chapter02.test27;

public class TourBus {
    public static void main(String... args) {
        var nycTour = new String[]{"Downtown", "Uptown",
                "Brooklyn"};
        var times = new String[]{"Day", "Night"};
        for (int i = 0, j = 1; i < nycTour.length && j < times.length;
             i++, j++)
            System.out.println(nycTour[i] + "-" + times[j]);
    }
}
