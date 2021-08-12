package acme.tests.chapter13.test14;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface Fast {
    int topSpeed() default 10;
}

@Fast
class BigCat {
}

public class Cheetah extends BigCat {
    public static void main(String... unused) {
        var a = Cheetah.class.getAnnotation(Fast.class);
        System.out.print(a);
    }
}
