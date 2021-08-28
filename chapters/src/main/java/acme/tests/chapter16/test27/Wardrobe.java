package acme.tests.chapter16.test27;

abstract class TShirt {
    abstract int insulate();
    public TShirt() {
        System.out.print("Starting…");
    }
}

public class Wardrobe {
    abstract class Sweater extends TShirt {
        int insulate() {return 5;}
    }
    private void dress() {
        /* final */ class Jacket extends Sweater {  // v1
            int insulate() {return 10;}
        };
        final TShirt outfit = new Jacket() {  // v2
            int insulate() {return 20;}
        };
        System.out.println("Insulation:"+outfit.insulate());
    }

    public static void main(String... snow) {
        new Wardrobe().dress();
    }
}
