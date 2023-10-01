package java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GenericsAndPredicateExample {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(7);
        numbers.add(30);

        // Predicate kullanarak çift sayıları filtrele
        Predicate<Integer> evenNumberPredicate = number -> number % 2 == 0;
        List<Integer> evenNumbers = filterList(numbers, evenNumberPredicate);

        System.out.println("Even numbers: " + evenNumbers);
    }

    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T item : list) {
            if (predicate.test(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }
}
