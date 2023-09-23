package generics;

import java.util.ArrayList;

public class GenericsMethod2<S> {


    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>();
        ArrayList<Integer> integers =new ArrayList<>();
    }

    public static <T> void print(T data){
        System.out.println(data);
    }

    /*public static void print(Integer integer){}

    public static  void print(String str){}

    public static  void print(Double str){}

    public static  void print(Long str){}

    public static  void print(Float str){}*/
}
