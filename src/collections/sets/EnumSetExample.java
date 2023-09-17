package collections.sets;

import java.util.EnumSet;
import java.util.Iterator;

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

public class EnumSetExample {

        public static void main(String[] args) {
            // Creating an EnumSet using allOf()
            EnumSet<Size> sizesAllOf = EnumSet.allOf(Size.class);
            System.out.println("All Of EnumSet: " + sizesAllOf);

            Iterator<Size> iterate = sizesAllOf.iterator();
            System.out.print("All Of EnumSet With Iterator: ");
            while(iterate.hasNext()) {
                System.out.print(iterate.next());
                System.out.print(", ");
            }
            System.out.println("");

            // Using remove()
            boolean value1 = sizesAllOf.remove(Size.MEDIUM);
            System.out.println("Is MEDIUM removed? " + value1);
            value1 = sizesAllOf.remove(Size.MEDIUM);
            System.out.println("Is MEDIUM removed twice? " + value1);



            // Creating an EnumSet using noneOf()
            EnumSet<Size> sizesOfNone = EnumSet.noneOf(Size.class);
            System.out.println("Empty EnumSet: " + sizesOfNone);
            sizesOfNone.addAll(sizesAllOf);
            System.out.println("Add All Empty EnumSet: " + sizesOfNone);

            // Creating an EnumSet using range()
            EnumSet<Size> sizesInRange = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
            System.out.println("EnumSet In Range: " + sizesInRange);

            // Using of() with a single parameter
            EnumSet<Size> sizes1 = EnumSet.of(Size.MEDIUM);
            System.out.println("EnumSet1: " + sizes1);

            EnumSet<Size> sizes2 = EnumSet.of(Size.SMALL, Size.LARGE);
            System.out.println("EnumSet2: " + sizes2);


        }

}
