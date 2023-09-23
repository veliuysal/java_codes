package generics;

public class BasicGenerics {

    public static void main(String[] args) {
        GenericsClassDefinition<Integer> intObject = new GenericsClassDefinition<>(5);
        System.out.println("Generics Class Returns: "+intObject.getData());

        GenericsClassDefinition<String> strObject = new GenericsClassDefinition<>("Bilge Adam Java Eğitimi");
        System.out.println("Generics Class Returns: "+strObject.getData());
    }
}

class GenericsClassDefinition<T> {

    private T data;

    public GenericsClassDefinition(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}
