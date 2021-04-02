package acme.study_guide.chapter18.working_with_parallel_streams.processing_parallel_reductions.combining_results_with_reduce;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        System.out.println(List.of('w', 'o', 'l', 'f')
                .parallelStream()
                .reduce("",
                        (s1, c) -> s1 + c,
                        (s2, s3) -> s2 + s3));  // wolf
    }
}
