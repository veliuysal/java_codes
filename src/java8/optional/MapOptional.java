package java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapOptional {
    public static void main(String[] args) {
       /* Optional<String> string = Optional.of("  abracadabra  ");
        string.map(String::trim)
                .ifPresent(System.out::println); //abracadabra
                */

        Optional<List<String>> list = Optional.of(Arrays.asList());
        list.ifPresent(System.out::println);

        Optional<Integer> integer = Optional.ofNullable(null);
        integer.ifPresent(System.out::println);

        System.out.println(integer.orElse(45));
    }
}
