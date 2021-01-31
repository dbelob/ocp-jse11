package acme.study_guide.chapter13.review_questions.question08;

import java.lang.annotation.Repeatable;

@interface FerociousPack {
    Ferocious[] value();            // m1
}

@Repeatable(FerociousPack.class)    // m2
public @interface Ferocious {
}

@Ferocious
@Ferocious
class Lion {
}
