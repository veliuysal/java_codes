package java8.streams;

import java.util.stream.Stream;

public class SkipAndLimitExample {
    public static void main(String[] args) {
        Stream.iterate(10, n -> n + 2)
                .skip(3).limit(5).forEach(System.out::println);
    }
}
