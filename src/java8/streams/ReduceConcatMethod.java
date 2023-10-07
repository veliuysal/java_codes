package java8.streams;

import java.util.stream.Stream;

public class ReduceConcatMethod {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("w1", "o2", "l3", "f4");
        String word = stream.reduce("X", String::concat);
        System.out.println(word); // Xw1o2l3f4

        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        String word2 = stream2.reduce("", (s, c) -> s + c +"--");
        System.out.println(word2);

    }
}
