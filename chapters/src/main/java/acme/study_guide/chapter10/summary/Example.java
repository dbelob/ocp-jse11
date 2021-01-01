package acme.study_guide.chapter10.summary;

public class Example {
    static void run() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
