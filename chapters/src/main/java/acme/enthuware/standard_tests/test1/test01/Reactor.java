package acme.enthuware.standard_tests.test1.test01;

interface Boiler{
    public void boil();
    private static void log(String msg){ //1
        System.out.println(msg);
    }
    public static void shutdown(){
        log("shutting down");
    }
}
interface Vaporizer extends Boiler{
    public default void vaporize(){
        boil();
        System.out.println("Vaporized!");
    }
}

public class Reactor implements Vaporizer{
    public void boil() {
        System.out.println("Boiling...");
    }

    public static void main(String[] args) {
        Vaporizer v =  new Reactor(); //2
        v.vaporize(); //3
//        v.shutdown(); //4
        Boiler.shutdown(); //4
    }
}
