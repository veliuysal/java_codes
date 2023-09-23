package generics;

public class RestrictedBoundTypeGenerics {
    public static void main(String[] args) {
        RestrictedBoundType<Integer> obj=new RestrictedBoundType<>();
        obj.display();

        RestrictedBoundType<Float> obj2= new RestrictedBoundType<>();
        obj2.display();
    }
}

class RestrictedBoundType<T extends Number> {
    public void display() {
        System.out.println("This is bounded type generic class.");
    }
}