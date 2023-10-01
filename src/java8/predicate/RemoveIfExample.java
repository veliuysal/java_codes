package java8.predicate;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfExample {
    public static void main(String[] args) {
        List<String> stringTempList = new ArrayList<>();
        stringTempList.add("java8");
        stringTempList.add("bilge");
        stringTempList.add("adam");
        stringTempList.add("egitmen");
        stringTempList.add("hello");

        //default boolean removeIf(Predicate<? super E> filter)
        //Burada Predicate ayri yazip ekleyedebiliriz.
        //h ile başlayanları sil.
        stringTempList.removeIf(str -> str.startsWith("h"));

        stringTempList.forEach(System.out::println);
    }
}
