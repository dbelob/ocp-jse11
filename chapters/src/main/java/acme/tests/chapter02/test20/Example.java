package acme.tests.chapter02.test20;

public class Example {
    public static void main(String[] args) {
        int count = 0;
        var stops = new String[]{"Washington", "Monroe",
                "Jackson", "LaSalle"};
        while (count < stops.length)
            if (stops[++count].length() < 8)
                break;
            else continue;
        System.out.println(count);
    }
}
