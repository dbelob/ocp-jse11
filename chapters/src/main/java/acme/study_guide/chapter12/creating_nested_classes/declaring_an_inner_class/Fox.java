package acme.study_guide.chapter12.creating_nested_classes.declaring_an_inner_class;

public class Fox {
    private class Den {
    }

    public void goHome() {
        new Den();
    }

    public static void visitFriend() {
//        new Den();  // DOES NOT COMPILE
    }
}
