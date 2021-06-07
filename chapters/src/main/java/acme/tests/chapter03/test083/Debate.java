package acme.tests.chapter03.test083;

interface Speak {
    public default int getVolume() { return 20; }
}
interface Whisper {
    public default int getVolume() { return 10; }
}
public class Debate implements Speak, Whisper {
    public int getVolume() { return 30; }

    public int getDebateVolume() { return Whisper.super.getVolume(); }

    public static void main(String[] a) {
        var d = new Debate();

//        System.out.println(Whisper.d.getVolume());  // A (does not compile)
//        System.out.println(d.Whisper.getVolume());  // B (does not compile)
//        System.out.println(Whisper.super.getVolume());  // C (does not compile)
//        System.out.println(d.Whisper.super.getVolume());  // D (does not compile)
        System.out.println(d.getDebateVolume());
    }
}
