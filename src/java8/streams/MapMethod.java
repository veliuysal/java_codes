package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMethod {
    public static void main(String[] args) {
       /* Stream<String> s = Stream.of("Bilge", "Adam", "Java");
        s.map(String::length).forEach(System.out::println);*/
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
        List<Integer> even = numbers.stream()
                .map(Integer::valueOf)
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(even.toString());

    }
}
