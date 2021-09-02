package acme.study_guide.chapter12.understanding_interface_members.relying_on_a_default_interface_method;

public interface IsWarmBlooded {
    boolean hasScales();

    default double getTemperature() {
        return 10.0;
    }
}
