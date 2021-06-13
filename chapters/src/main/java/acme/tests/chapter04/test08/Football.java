package acme.tests.chapter04.test08;

public class Football {
    public static void main(String officials[]) {
        try {
            System.out.print('A');
            throw new ArrayIndexOutOfBoundsException();
        } catch (RuntimeException r) {
            System.out.print('B');
            throw r;
        } catch (Exception e) {
            System.out.print('C');
        } finally {
            System.out.print('D');
        }
    }
}
