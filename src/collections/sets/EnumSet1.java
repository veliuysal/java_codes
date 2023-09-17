package collections.sets;

import java.util.EnumSet;

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}


public class EnumSet1 {

        public static void main(String[] args) {
            // Creating an EnumSet using allOf()
            EnumSet<Size> sizes = EnumSet.allOf(Size.class);
            System.out.println("EnumSet: " + sizes);
        }

}
