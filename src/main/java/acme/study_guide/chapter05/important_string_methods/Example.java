package acme.study_guide.chapter05.important_string_methods;

public class Example {
    public static void main(String[] args) {
        String text = " abc\t ";
        System.out.println(text.trim().length());         // 3
        System.out.println(text.strip().length());        // 3
        System.out.println(text.stripLeading().length()); // 5
        System.out.println(text.stripTrailing().length());// 4
    }
}
