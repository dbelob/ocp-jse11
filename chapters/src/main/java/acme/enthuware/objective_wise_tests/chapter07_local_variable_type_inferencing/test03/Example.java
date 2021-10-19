package acme.enthuware.objective_wise_tests.chapter07_local_variable_type_inferencing.test03;

public class Example {
    public static void main(String[] args) {
        for (var x : System.getProperties().entrySet()) {
            var m = x.getKey();
        }

//        for (var x : System.getProperties().keySet()) {
//            System.out.println(x.length());
//        }
    }
}
