package acme.study_guide.chapter03.logical_complement_and_negation_operators;

public class Example {
    public static void main(String[] args) {
        double zooTemperature = 1.21;
        System.out.println(zooTemperature);  // 1.21
        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature);  // -1.21
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature);  // -1.21
    }
}
