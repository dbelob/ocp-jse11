package acme.enthuware.standard_tests.test2.test02;

public class Example {
    public static void main(String[] args) {
//        var i[][] = {{1, 2}, {1}, {}, {1, 2, 3}};
//        var i[ ] = new int[2] {1, 2} ;

        var i0 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        var i1 = new int[2][3];

//        var i = { { 1, 2 }, new int[ 2 ] } ;
        var i2 = new int[][]{{1, 2}, new int[2]};

//        var i[4] = new int[]{ 1, 2, 3, 4 } ;
        var i = new int[]{1, 2, 3, 4};
    }
}
