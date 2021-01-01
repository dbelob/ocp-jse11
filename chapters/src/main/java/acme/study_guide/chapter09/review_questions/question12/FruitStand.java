package acme.study_guide.chapter09.review_questions.question12;

// Which of the following statements about the FruitStand program are correct? (Choose all that apply.)
// (after deleting comment characters in five lines)
interface Apple {
}

interface Orange {
}

class Gala implements Apple {
}

class Tangerine implements Orange {
}

final class Citrus extends Tangerine {
}

public class FruitStand {
    public static void main(String... farm) {
        Gala g = new Gala();
        Tangerine t = new Tangerine();
        Citrus c = new Citrus();
//        System.out.print(t instanceof Gala);          // line 11
//        System.out.print(c instanceof Tangerine);     // line 12
//        System.out.print(g instanceof Apple);         // line 13
//        System.out.print(t instanceof Apple);         // line 14
//        System.out.print(c instanceof Apple);         // line 15
    }
}
// A. Line 11 contains a compiler error.
// B. Line 12 contains a compiler error.
// C. Line 13 contains a compiler error.
// D. Line 14 contains a compiler error.
// E. Line 15 contains a compiler error.
// F. None of the above
