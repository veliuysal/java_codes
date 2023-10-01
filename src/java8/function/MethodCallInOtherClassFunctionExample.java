package java8.function;

import java.util.function.Function;

class Utility{

    public static int calculateLengthOfTemp(String str){
        return str.length();
    }
}

public class MethodCallInOtherClassFunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> f1 = Utility::calculateLengthOfTemp;
        System.out.println(f1.apply("veliuysal"));

        //
        Function<String, Integer> f2 = String::length;
        System.out.println(f2.apply("veliuysal"));
    }
}
