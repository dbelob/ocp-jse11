package acme.study_guide.chapter04.review_questions.question06;

public class Example {
    public static void main(String[] args) {
        int count = 0;
        BUNNY:
        for (int row = 1; row <= 3; row++)
            RABBIT:for (int col = 0; col < 3; col++) {
                if ((col + row) % 2 == 0)
//                    break BUNNY;        // A: (1, 0), count++, (1, 1), break BUNNY - 1
//                    break RABBIT;       // B: (1, 0), count++, (1, 1), break RABBIT, (2, 0), break RABBIT, (3, 0), count++, (3, 1), break RABBIT - 2
//                    continue BUNNY;     // C: (1, 0), count++, (1, 1), continue BUNNY, (2, 0), continue BUNNY, (3, 0), count++, (3, 1), continue BUNNY - 2
//                    continue RABBIT;    // D: (1, 0), count++, (1, 1), continue RABBIT, (1, 2), count++, (2, 0), continue RABBIT, (2, 1), count++, (2, 2), continue RABBIT, (3, 0), count++, (3, 1), continue RABBIT, (3, 2), count++
//                    break;              // E: (same C) - 2
//                    continue;           // F: (same D) - 5
                count++;
            }
        System.out.println(count);
    }
}
