package acme.tests.chapter03.test102;

public class Eggs {
    enum Animal {
        CHICKEN(21), PENGUIN(75);

        private int numDays;
        private Animal(int numDays) {
            this.numDays = numDays;
        }
        public int getNumDays() {
            return numDays;
        }
        public void setNumDays(int numDays) {
            this.numDays = numDays;
        }
    }
    public static void main(String[] args) {
        Animal chicken = Animal.CHICKEN;
        chicken.setNumDays(20);

        System.out.print(chicken.getNumDays());
        System.out.print(" ");
        System.out.print(Animal.CHICKEN.getNumDays());
        System.out.print(" ");
        System.out.print(Animal.PENGUIN.getNumDays());
    }
}
