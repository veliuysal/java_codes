package java8.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RangeExample {
    public static void main(String[] args) {
        /*IntStream.range(1, 10).forEach(System.out::println);

        IntStream.rangeClosed(1, 5)
                .map(e -> e * 2)
                .forEach(System.out::println);

        IntStream.iterate(10, i -> i + 5)
                .limit(6)
                .forEach(System.out::println);*/
        // public static IntStream stream(int[] array) {
        IntStream intStream = Arrays.stream(new int[] { 1, 2, 3, 4, 5 });
        intStream.forEach(System.out::println);

// public static <T> Stream<T> stream(T[] array) {
        Stream<Integer> integerStream = Arrays.stream(new Integer[] { 1, 2, 3, 4, 5 });
        integerStream.forEach(System.out::println);
    }
}
