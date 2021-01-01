package acme.study_guide.chapter02.introducing_var;

public class Example {
    public void doesThisCompile(boolean check) {
//        var question;
//        question = 1;
        var question = 1;
//        var answer;
        var answer = 0;
        if (check) {
            answer = 2;
        } else {
            answer = 3;
        }
        System.out.println(answer);
    }
}
