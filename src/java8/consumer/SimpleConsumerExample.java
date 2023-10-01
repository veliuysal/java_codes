package java8.consumer;

import java.util.function.Consumer;

public class SimpleConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("java");
    }
}
