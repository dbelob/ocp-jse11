package acme.tests.chapter15.test29;

import java.lang.annotation.Inherited;

@Inherited
public @interface Panic {
//    public abstract alert() default 10;
    public abstract int alert() default 10;
    public final static int alarm_volume = 10;
    String[] type() default {"test"};
//    Long range();
    long range();
    abstract boolean silent();
}
