package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {

    public static void main(String[] args) {
        // Creating HashMap of even numbers
       /* HashMap<String, Integer> numbers = new HashMap<>();

        String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;

        // Inserting elements
        numbers.put(two, twoValue);
        numbers.put(four, fourValue);

        System.out.println("HashMap: " + numbers);

        // Make the reference null
        two = null;

        // Perform garbage collection
        System.gc();

        System.out.println("HashMap after garbage collection: " + numbers);*/

        Map<Key, String> weakHashMap = new WeakHashMap<>();

        Key key1 = new Key("Key1");
        Key key2 = new Key("Key2");

        // Add keys and values
        weakHashMap.put(key1, "Value1");
        weakHashMap.put(key2, "Value2");

        // Access values
        System.out.println("Value for key1: " + weakHashMap.get(key1));
        System.out.println("Value for key2: " + weakHashMap.get(key2));

        // Make keys null to allow garbage collector to collect them
        key1 = null;
        key2 = null;

        // Trigger garbage collection to collect weak references
        System.gc();

        // Access values after collection
        System.out.println("Value for key1 after GC: " + weakHashMap.get(new Key("Key1")));
        System.out.println("Value for key2 after GC: " + weakHashMap.get(new Key("Key2")));
    }
}

class Key {
    private String key;

    public Key(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return key;
    }
}

