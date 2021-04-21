package acme.study_guide.chapter19.review_questions.question07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Example {
    public static String pullBytes(InputStream in, int count)
            throws IOException {
        in.mark(count);
        var sb = new StringBuilder();
        for (int i = 0; i < count; i++)
            sb.append((char) in.read());
        in.reset();
        in.skip(1);
        sb.append((char) in.read());
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
//        try (FileOutputStream fos = new FileOutputStream("input/chapter19-question07.txt");
//             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
//            oos.writeBytes("XYZABC");
//        }

        try (FileInputStream fis = new FileInputStream("input/chapter19-question07.txt");
             InputStream in = new ObjectInputStream(fis)) {
            String result = pullBytes(in, 3);

            System.out.println(result);
        }
    }
}
