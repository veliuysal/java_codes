package java8.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterMethod {
    public static void main(String[] args) {
        /*IntStream.rangeClosed(0,10)
                .filter(i -> (i % 2 == 0))
                .map(i -> i*3)
                .forEach(System.out::println);*/

        Stream.of("Bilge", "Adam", "","Java").filter(name ->!name.isEmpty()).forEach(System.out::println);
    }
}
