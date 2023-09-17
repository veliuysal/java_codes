package collections.sets;

import java.util.LinkedHashSet;

public class RemoveInLinkedHashMap {

    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("LinkedHashSet: " + numbers);

        // Using the remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

       /* boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);*/

        LinkedHashSet<Integer> emptySet = new LinkedHashSet<>();
        boolean value3 = numbers.removeAll(emptySet);
        System.out.println("RemoveAll EmptySet: " + numbers);
        System.out.println("RemoveAll EmptySet return value: " + value3);

        numbers.clear();
        System.out.println("After Clear: " + numbers);
    }
}
