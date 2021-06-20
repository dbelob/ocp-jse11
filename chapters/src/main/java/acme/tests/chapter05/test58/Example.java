package acme.tests.chapter05.test58;

public class Example {
    public static void main(String[] args) {
        char[][] ticTacToe = new char[3][3];                 // r1
        ticTacToe[1][3] = 'X';                               // r2
        ticTacToe[2][2] = 'X';
        ticTacToe[3][1] = 'X';
        System.out.println(ticTacToe.length + " in a row!"); // r3
    }
}
