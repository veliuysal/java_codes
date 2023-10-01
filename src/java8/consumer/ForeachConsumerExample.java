package java8.consumer;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForeachConsumerExample {
    public static void main(String[] args) {
        // the forEach method gets the consumer.
        // package java.util.stream; -> void forEach(Consumer<? super T> action);

        // 1. use-case
        Consumer<Integer> c1 = x -> System.out.print(x * 2);
        Stream.of(1,2).forEach(c1);
        System.out.println();

        // 2. use-case
        Consumer<Integer> c2 = (Integer x) -> System.out.print(x);
        Stream.of(1,2).forEach(c2);
        System.out.println();

        // 3. use-case
        Stream.of(1,2).forEach(x -> System.out.print(x+2));
        System.out.println();

        // 4. use-case
        Stream.of(1,2).forEach(System.out::print);
    }
}
