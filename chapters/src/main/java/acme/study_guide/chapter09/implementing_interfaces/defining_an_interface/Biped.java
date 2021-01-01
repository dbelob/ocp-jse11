package acme.study_guide.chapter09.implementing_interfaces.defining_an_interface;

public class Biped {
    public static void main(String[] args) {
//        var e = new WalksOnTwoLegs();         // DOES NOT COMPILE
        var e = new WalksOnTwoLegs() {
        };
    }
}
