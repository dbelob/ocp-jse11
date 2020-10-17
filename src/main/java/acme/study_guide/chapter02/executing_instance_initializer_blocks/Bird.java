package acme.study_guide.chapter02.executing_instance_initializer_blocks;

public class Bird {
    public static void main(String[] args) {
        {
            System.out.println("Feathers");
        }
    }

    {
        System.out.println("Snowy");
    }
}
