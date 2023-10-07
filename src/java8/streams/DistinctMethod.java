package java8.streams;

import java.util.stream.Stream;

public class DistinctMethod {
    public static void main(String[] args) {
        Stream.of("Java", "Java", "Java8", "JAva")
                .distinct()
                .forEach(System.out::println);
    }
}
