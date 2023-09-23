package generics;

public class BoundedTypes<T extends Object> {

    private T data;

    public static void main(String[] args) {
        BoundedTypes<Integer> intType = new BoundedTypes<>();
        intType.setData(25);

        BoundedTypes<String> strType = new BoundedTypes<>();
        strType.setData("Java Dersi");

        System.out.println("Int Type: " + intType.data);
        System.out.println("Str Type: " + strType.data);

        GenericsClass<Integer> genericsClass = new GenericsClass<>();
        genericsClass.setItem(23);
        BoundedTypes<GenericsClass<Integer>> innerGenerics = new BoundedTypes<>();
        innerGenerics.setData(genericsClass);
        System.out.println("Inner Generics' Data: " + innerGenerics.data.getItem());
    }

    public void setData(T data) {
        this.data = data;
    }
}
