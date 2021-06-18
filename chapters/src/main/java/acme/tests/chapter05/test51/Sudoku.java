package acme.tests.chapter05.test51;

// What is the result of running the following program?
public class Sudoku {                           // 2
    static int[][] game = new int[6][6];        // 3
                                                // 4
    public static void main(String[] args) {    // 5
        game[3][3] = 6;                         // 6
        Object[] obj = game;                    // 7
        obj[3] = "X";                           // 8
        System.out.println(game[3][3]);         // 9
    }                                           // 10
}                                               // 11
// A. 6
// B. X
// C. The code does not compile.
// D. The code compiles but throws a NullPointerException at runtime.
// E. The code compiles but throws a different exception at runtime.
