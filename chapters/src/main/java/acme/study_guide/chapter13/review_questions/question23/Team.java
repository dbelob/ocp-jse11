package acme.study_guide.chapter13.review_questions.question23;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface Plumber {
    String value() default "Mario";
}

public class Team {
    @Plumber("")
    private String foreman = "Mario";
    @Plumber
    private String worker = "Kelly";
    @Plumber("Kelly")
    private String trainee;

    public static void main(String[] args) {
        var t = new Team();
        var fields = t.getClass().getDeclaredFields();
        for (Field field : fields)

            if (field.isAnnotationPresent(Plumber.class))
                System.out.print(field.getAnnotation(Plumber.class)
                        .value());
    }
}
