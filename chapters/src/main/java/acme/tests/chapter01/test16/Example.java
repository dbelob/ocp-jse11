package acme.tests.chapter01.test16;

public class Example {
    public static void main(String[] args) {
        var happy = " :) - (: ";
        var really = happy.trim();
        var question = happy.substring(1, happy.length() - 1);
        System.out.println(really.equals(question));
    }
}
