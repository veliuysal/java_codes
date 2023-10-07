package java8.optional;

import java.util.Optional;

public class SimpleExample {
    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty(); // create empty optional

        Optional<String> opt1 = Optional.of("value");
        System.out.println(opt1); // Optional[value]
        System.out.println(opt1.get()); // value
        System.out.println(emptyOptional); // Optional.empty
    }
}
