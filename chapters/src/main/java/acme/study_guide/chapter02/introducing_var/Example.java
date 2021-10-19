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

    public void twoTypes() {
//        int a, var b = 3;  // DOES NOT COMPILE
//        var n = null;      // DOES NOT COMPILE
        int a, b = 3;
//        var a2, b2 = 3;
    }
}
