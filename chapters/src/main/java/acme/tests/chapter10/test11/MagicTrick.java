package acme.tests.chapter10.test11;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

public class MagicTrick {
    private static final String WORD = "abracadabra";
    private static List<String> trick = new ArrayList<>();
    public static List<String> castSpell(String magic) {
        return AccessController.doPrivileged(
                new PrivilegedAction<List<String>>() {
                    public List<String> run() {
                        if (magic.equalsIgnoreCase(WORD)) {         // p1
                            if(trick.isEmpty())
                                trick.add(System.getProperty(magic)); // p2
                            return trick;                            // p3
                        }
                        throw new SecurityException("Incorrect code");
                    }
                });
    }
    public static void main(String[] args) {
        if(args != null && args.length>0)
            System.out.print(MagicTrick.castSpell(args[0]));
    }
}
