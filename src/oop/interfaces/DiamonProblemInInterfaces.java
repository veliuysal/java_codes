package oop.interfaces;

interface MyInterface1{
    public default void defaultMethod(){
        System.out.println("MyInterface1 defaultMethod");
    }

    public abstract void test();
}

interface MyInterface2{
    public default void defaultMethod(){
        System.out.println("MyInterface2 defaultMethod");
    }

    public abstract void test();
}

class DiamondProblem implements MyInterface1, MyInterface2{

    @Override
    public void defaultMethod() {
        // 2 interface'de de ayni isimde default method vardir,
        // biz bu 2 interface' i implements ettigimizde, compiler hatasi verir.
        // mutlaka default methodu'da override etmemiz gerekmektedir.
        System.out.println("DiamondProblem class");
    }

    @Override
    public void test() {

    }
}

public class DiamonProblemInInterfaces {
    public static void main(String[] args) {
        DiamondProblem diamondProblem = new DiamondProblem();
        diamondProblem.defaultMethod();
    }
}

