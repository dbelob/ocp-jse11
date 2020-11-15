package acme.study_guide.chapter05.review_questions.question07;

public class Example {
    public static void main(String[] args) {
        var string = "12345";
        var builder = new StringBuilder("12345");

        System.out.printf("A: %s\n", builder.charAt(4));
        System.out.printf("B: %s\n", builder.replace(2, 4, "6").charAt(3));
        System.out.printf("C: %s\n", builder.replace(2, 5, "6").charAt(2));
//        System.out.printf("D: %s\n", string.charAt(5));
//        System.out.printf("E: %s\n", string.length);
        System.out.printf("F: %s\n", string.replace("123", "1").charAt(2));
    }
}
