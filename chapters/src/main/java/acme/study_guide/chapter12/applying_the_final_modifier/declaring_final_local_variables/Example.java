package acme.study_guide.chapter12.applying_the_final_modifier.declaring_final_local_variables;

public class Example {
    private void printZooInfo(boolean isWeekend) {
        final int giraffe = 5;
        final long lemur;
        if (isWeekend) lemur = 5;
        else lemur = 10;
        System.out.println(giraffe + " " + lemur);
    }
}
