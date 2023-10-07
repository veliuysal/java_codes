package java8.streams;

import java.util.stream.Stream;

public class PeekMethod {
    public static void main(String[] args) {
        //No output
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e));

        Stream.of(1, 2, 3, 4, 5)
                .peek(i -> System.out.printf("%d ", i))
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d ", i)).count();
    }
}
