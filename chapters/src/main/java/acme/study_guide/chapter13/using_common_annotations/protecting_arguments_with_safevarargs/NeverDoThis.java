package acme.study_guide.chapter13.using_common_annotations.protecting_arguments_with_safevarargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NeverDoThis {
    final int thisIsUnsafe(List<Integer>... carrot) {
        Object[] stick = carrot;
        stick[0] = Arrays.asList("nope!");
        return carrot[0].get(0);  // ClassCastException at runtime
    }

    public static void main(String[] a) {
        var carrot = new ArrayList<Integer>();
        new NeverDoThis().thisIsUnsafe(carrot);
    }
}
