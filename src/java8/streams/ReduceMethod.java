package java8.streams;

import java.util.stream.Stream;

public class ReduceMethod {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(3, 5, 6);
        Stream<Integer> stream2 = Stream.of(3, 5, 6);

// T reduce(T identity, BinaryOperator<T> accumulator);
        System.out.println(stream.reduce(10, (a, b) -> a * b));
//Sout: 900

// Optional<T> reduce(BinaryOperator<T> accumulator);
        System.out.println(stream2.reduce((a, b) -> a * b));
//Sout: 900Optional[90]

    }
}
