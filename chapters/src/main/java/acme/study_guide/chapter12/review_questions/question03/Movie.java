package acme.study_guide.chapter12.review_questions.question03;

public class Movie {
    private int butter = 5;

    private Movie() {
    }

    protected class Popcorn {
        private Popcorn() {
        }

        public static final int butter = 10;

        public void startMovie() {
            System.out.println(butter);
        }
    }

    public static void main(String[] args) {
        var movie = new Movie();
        Movie.Popcorn in = new Movie().new Popcorn();
        in.startMovie();
    }
}
