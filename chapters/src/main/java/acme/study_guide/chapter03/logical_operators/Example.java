package acme.study_guide.chapter03.logical_operators;

public class Example {
    public static void main(String[] args) {
        boolean eyesClosed = true;
        boolean breathingSlowly = true;

        boolean resting = eyesClosed | breathingSlowly;
        boolean asleep = eyesClosed & breathingSlowly;
        boolean awake = eyesClosed ^ breathingSlowly;
        System.out.println(resting);  // true
        System.out.println(asleep);   // true
        System.out.println(awake);    // false
    }
}
