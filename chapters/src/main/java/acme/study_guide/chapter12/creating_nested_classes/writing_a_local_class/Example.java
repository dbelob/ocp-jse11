package acme.study_guide.chapter12.creating_nested_classes.writing_a_local_class;

public class Example {
    public void processData() {
        final int length = 5;
        int width = 10;
        int height = 2;
        class VolumeCalculator {
            public int multiply() {
                return length * width * height; // DOES NOT COMPILE
            }
        }
//        width = 2;
    }
}
