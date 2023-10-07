package java8.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LocalDateTimeStream {
    public static void main(String[] args) {
        Stream.of("Java8", "Supplier", "Example").forEach(name -> printNames(() -> name));
        List<String> list = Stream.generate(LocalDateTimeStream::createNewString).limit(10).collect(Collectors.toList());
        System.out.println(list.size());
    }

    private static void printNames(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

    private static String createNewString() {
        return new String();
    }
}
