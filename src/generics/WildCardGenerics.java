package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WildCardGenerics {

    public static void lowerBoundedWildcard(List<? super Number> param) {
        System.out.println("lowerBoundedWildcard is working..");
    }

    public static void upperBoundedWildcard(List<? extends Number> param) {
        System.out.println("upperBoundedWildcard is working..");
    }

    public static void wildcard(List<?> param){
        System.out.println("wildcard is working");
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        lowerBoundedWildcard(Collections.singletonList(list1));
        upperBoundedWildcard(list1);
        wildcard(list1);
    }
}
