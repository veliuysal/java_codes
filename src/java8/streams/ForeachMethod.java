package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ForeachMethod {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
       // s.forEach(System.out::print); // MonkeyGorillaBonobo
// Consumer
// void accept(T t);

        List<String> list = new ArrayList<>();
        s.forEach((str) ->
        {
            String sUpper = str.toUpperCase();
            list.add(sUpper);
        });
        System.out.println(list);
    }
}
