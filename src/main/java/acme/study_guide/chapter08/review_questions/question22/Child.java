package acme.study_guide.chapter08.review_questions.question22;

// What does the following program print?
class Person {
   static String name;
   void setName(String q) { name = q; } }
public class Child extends Person {
   static String name;
   void setName(String w) { name = w; }
   public static void main(String[] p) {
      final Child m = new Child();
      final Person t = m;
      m.name = "Elysia";
      t.name = "Sophia";
      m.setName("Webby");
      t.setName("Olivia");
      System.out.println(m.name + " " + t.name);
   } }
// A. Elysia Sophia
// B. Webby Olivia
// C. Olivia Olivia
// D. Olivia Sophia
// E. The code does not compile.
// F. None of the above
