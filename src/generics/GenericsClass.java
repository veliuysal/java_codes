package generics;

public class GenericsClass<T> {

    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

    public static void main(String[] args) {
        GenericsClass<String> strClass = new GenericsClass<>();
        strClass.setItem("Hello World.");
        String message = strClass.getItem();
        System.out.println("Message is: " + message);

        GenericsClass<Integer> intClass = new GenericsClass<>();
        intClass.setItem(42);
        int number = intClass.getItem();
        System.out.println("Sayı: " + number);
    }
}
