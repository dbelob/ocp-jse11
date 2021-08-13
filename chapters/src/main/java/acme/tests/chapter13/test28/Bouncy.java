package acme.tests.chapter13.test28;

import java.lang.annotation.Documented;

enum Colors {RED, BLUE, GREEN}

@Documented
public @interface Bouncy {
    int value();

    Colors color() default Colors.RED;

    double size();
}

//@Bouncy(999, size = 10.0)
@Bouncy(value = 999, size = 10.0)
class Trampoline {
}
