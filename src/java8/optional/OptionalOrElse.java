package java8.optional;

import java.util.Optional;



public class OptionalOrElse {
    public static void main(String[] args) {
        Optional<String> string = Optional.ofNullable(null); //Optional.empty

        System.out.println(string.map(String::length).orElse(-1)); // -1
        System.out.println(string.map(String::length)
                .orElseThrow(IndexOutOfBoundsException::new));
    }
}
