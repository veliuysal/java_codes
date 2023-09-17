package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add key-value pairs
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        linkedHashMap.put("Four", 4);

        // Print the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Accessing elements
        System.out.println("Value of 'Three': " + linkedHashMap.get("Three"));

    }
}
