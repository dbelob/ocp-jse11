package acme.tests.chapter03.test94;

abstract class Triangle {
    abstract String getDescription();
}
abstract class IsoRightTriangle extends RightTriangle { // g1
    public String getDescription() { return "irt"; }
}
public class RightTriangle extends Triangle {
    protected String getDescription() { return "rt"; }  // g2
    public static void main(String[] edges) {
//        final var shape = new IsoRightTriangle();        // g3
//        System.out.print(shape.getDescription());
    }
}
