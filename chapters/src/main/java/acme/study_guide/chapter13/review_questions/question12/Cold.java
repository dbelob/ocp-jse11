package acme.study_guide.chapter13.review_questions.question12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

enum UnitOfTemp {C, F}

@interface Snow {
    boolean value();
}

@Target(ElementType.METHOD)
public @interface Cold {
//    private Cold() {
//    }

//    int temperature;
    UnitOfTemp unit() default UnitOfTemp.C;

    Snow snow() default @Snow(true);
}
