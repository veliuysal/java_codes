package java8.streams;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetCollectorExample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);
    }
}
