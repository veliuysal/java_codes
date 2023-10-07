package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MatchMethods {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("monkey", "2", "chimp");

        Stream<String> infinite = Stream.generate(() -> "chimp");
        Stream<String> infinite2 = Stream.generate(() -> "chimp");

        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred)); // true
        System.out.println(list.stream().allMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred));// false

// infinitive
        System.out.println(infinite.anyMatch(pred)); // true
// System.out.println(infinite.allMatch(pred)); // true -> endless loop

        System.out.println(infinite2.noneMatch(pred)); // false

    }
}
