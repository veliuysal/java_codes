package collections.map;

import java.util.HashMap;

public class AddElementToHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> languages = new HashMap<>();

        // add elements to hashmap
        languages.put("Java", 8);
        languages.put("JavaScript", 1);
        languages.put("Python", 3);
        System.out.println("HashMap: " + languages);
    }
}
