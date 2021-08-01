package acme.tests.chapter10.test21;

import java.security.AccessController;
import java.security.PrivilegedAction;

public class PrintScores {
    private static final String CODE = "12345";
    private static final String SCORES = "test.scores";

    public static String getScores(String accessCode) {
        return AccessController.doPrivileged(
                new PrivilegedAction<String>() {
                    public String run() {
                        if (accessCode.equals(CODE))           // m1
                            return System.getProperty(SCORES); // m2
                        throw new SecurityException("Incorrect code");
                    }
                });
    }

    public static void main(String[] args) {
        if (args != null && args.length > 0)
            System.out.print(PrintScores.getScores(args[0]));
    }
}
