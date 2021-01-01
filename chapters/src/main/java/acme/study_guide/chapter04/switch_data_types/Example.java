package acme.study_guide.chapter04.switch_data_types;

public class Example {
    public static void main(String[] args) {
        int a = 1;
        long b = 1;
        var c = 1;

        switch (a) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
        }

//        switch (b) {
//            case 0:
//                System.out.println(0);
//                break;
//            case 1:
//                System.out.println(1);
//        }

        switch (c) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
        }
    }
}
