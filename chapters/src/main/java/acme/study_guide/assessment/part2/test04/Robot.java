package acme.study_guide.assessment.part2.test04;

import java.lang.annotation.Documented;

class IsAware {
}

enum Mode {AUTONOMOUS, DEPENDENT}

@interface CleaningProgram {
    Mode mode();
}

@Documented
public @interface Robot {
//    CleaningProgram cp()
//            default @CleaningProgram(Mode.AUTONOMOUS);

    final int MAX_CYCLES = 10;

//    IsAware aware();

//    String name() = 10;
}
