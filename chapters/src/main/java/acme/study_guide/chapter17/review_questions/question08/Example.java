package acme.study_guide.chapter17.review_questions.question08;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;
import java.util.stream.Collectors;

class Unicorn {
}

public class Example {
    public static void main(String[] args) {
        List<Unicorn> all = new ArrayList<>();
        for (Unicorn current : ServiceLoader.load(Unicorn.class))
            all.add(current);

//        List<Unicorn> all2 = ServiceLoader.load(Unicorn.class)
//                .getStream()
//                .map(Provider::get)
//                .collect(Collectors.toList());

        List<Unicorn> all3 = ServiceLoader.load(Unicorn.class)
                .stream()
                .map(Provider::get)
                .collect(Collectors.toList());
    }
}
