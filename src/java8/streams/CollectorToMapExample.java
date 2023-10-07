package java8.streams;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorToMapExample {
    public static void main(String[] args) {
        Map<String, Integer> nameLength = Stream.of("Arnold", "Alois", "Schwarzenegger")
                .collect(Collectors.toMap(name -> name, String::length));
        System.out.println(nameLength);
    }
}
