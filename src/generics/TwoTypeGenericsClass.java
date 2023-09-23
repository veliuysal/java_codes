package generics;

public class TwoTypeGenericsClass<T, S> {

    private T first;
    private S second;

    TwoTypeGenericsClass(T first) {
        this.first = first;
    }

    TwoTypeGenericsClass(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return  this.first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public S getSecond() {
        return this.second;
    }

    public static void main(String[] args) {
        TwoTypeGenericsClass<String, Integer> twoTypes =new TwoTypeGenericsClass<>("Bilge Adam Java Eğitimi");
        twoTypes.setSecond(9);
        System.out.println("First: "+twoTypes.getFirst()+" - Second: " +twoTypes.getSecond());

        TwoTypeGenericsClass<String, Integer> twoTypes2 =new TwoTypeGenericsClass<>("Bilge Adam Java Eğitimi", 9);
        System.out.println("First: "+twoTypes2.getFirst()+" - Second: " +twoTypes2.getSecond());

    }
}
