package acme.study_guide.assessment.part2.test12;

class Wizard {
    private enum Hat {
        BIG, SMALL
    }

    protected class MagicWand {
        void abracadabra() {
            System.out.print("Poof!");
        }
    }
}

public class CastSpells {
    public static void main(String[] args) {
        var w = new Wizard();

        // A
//        class DarkWizard extends Wizard {}.new MagicWand().abracadabra();

        // B
        new Wizard().new MagicWand().abracadabra();

        // C
//        Wizard.new MagicWand().abracadabra();

        // D
        w.new MagicWand(){
            void abracadabra(int spell) {
                System.out.print("Oops!"); } }.abracadabra();

        // E
//        new MagicWand().abracadabra();

        // F
        w.new MagicWand().abracadabra();
    }
}
