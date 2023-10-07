package java8.streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class MinMaxMethod {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("monkey", "ape", "bonobo");
        Stream<String> stream2 = Stream.of("monkey", "ape", "bonobo");

        Comparator<String> comp = Comparator.comparingInt(String::length);

        Optional<String> min = stream1.min(comp);
        Optional<String> max = stream2.max(comp);

        System.out.println(min.get());
        System.out.println(max);
    }
}
