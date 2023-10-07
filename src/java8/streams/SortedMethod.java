package java8.streams;

import java.util.stream.Stream;

public class SortedMethod {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("brown-", "bear-", "bee-");
        s.sorted().forEach(System.out::print);
    }
}
