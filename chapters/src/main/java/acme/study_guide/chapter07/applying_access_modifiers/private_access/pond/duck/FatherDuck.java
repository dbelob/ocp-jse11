package acme.study_guide.chapter07.applying_access_modifiers.private_access.pond.duck;

public class FatherDuck {
    private String noise = "quack";

    private void quack() {
        System.out.println(noise);     // private access is ok
    }

    private void makeNoise() {
        quack();                       // private access is ok
    }

    public void something() {
        FatherDuck other = new FatherDuck();

        other.makeNoise();
        System.out.println(other.noise);
    }

    public static void main(String[] args) {
        FatherDuck other = new FatherDuck();

        other.makeNoise();
        System.out.println(other.noise);
    }
}
