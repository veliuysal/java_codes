package collections.map;

import java.util.EnumMap;
import java.util.Map;

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumHashMapExample {

    public static void main(String[] args) {
        Map<Days, String> enumMap = new EnumMap<>(Days.class);

        // Add key-value pairs
        enumMap.put(Days.MONDAY, "First day");
        enumMap.put(Days.TUESDAY, "Second day");
        enumMap.put(Days.WEDNESDAY, "Third day");

        // Access values using enum keys
        System.out.println("Value for MONDAY: " + enumMap.get(Days.MONDAY));
        System.out.println("Value for TUESDAY: " + enumMap.get(Days.TUESDAY));
        System.out.println("Value for WEDNESDAY: " + enumMap.get(Days.WEDNESDAY));
    }
}
