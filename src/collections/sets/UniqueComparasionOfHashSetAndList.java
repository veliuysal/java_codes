package collections.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueComparasionOfHashSetAndList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Cat");
        list.add("Dog");
        list.add("Cat");
        list.add("Cow");
        list.add("Cat");
        list.add("Horse");
        list.add("Cat");

        System.out.println("Arraylist: " + list);

        Set<String> set = new HashSet<>(list);
        System.out.println("Set: " + set);
    }
}
