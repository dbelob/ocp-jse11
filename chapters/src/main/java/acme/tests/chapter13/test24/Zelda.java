package acme.tests.chapter13.test24;

@interface Sword {}
public @interface Zelda {
//   private String game();
   Sword sword();
//   java.util.List<Integer> gems;
//   final boolean hasBossKey();
   public abstract int level() default 99;
//   protected boolean continue();
}
