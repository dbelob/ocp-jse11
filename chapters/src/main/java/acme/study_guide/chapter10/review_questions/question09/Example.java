package acme.study_guide.chapter10.review_questions.question09;

public class Example {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try {
            System.out.print(a / b);
        } catch (ArithmeticException e) {
            System.out.print(0);
        } catch (RuntimeException e) {
            System.out.print(-1);
//        } catch (ArithmeticException e) {
//            System.out.print(0);
        } finally {
            System.out.print("done");
        }
    }
}
