package collections.list;

import java.util.ArrayList;

public class RemoveElementFromArraylist {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        // add elements in the array list
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayList: " + animals);
        System.out.println("First size: "+animals.size());

        // remove element from index 2
        String str = animals.remove(2);
        System.out.println("Second size: "+animals.size());
        boolean removed= animals.remove("Cat");
        System.out.println("Last size: "+animals.size());
        System.out.println("Updated ArrayList: " + animals);
        System.out.println("Removed Element: " + str);
        System.out.println("Cat removed: "+removed);
    }
}
