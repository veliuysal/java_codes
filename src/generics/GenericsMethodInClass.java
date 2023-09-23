package generics;

public class GenericsMethodInClass {
    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        demoClass.genericsMethod("Bilge Adam Java Eğitimi");
        demoClass.<String>genericsMethod("Bilge Adam Java Eğitimi");

        demoClass.<Integer>genericsMethod(43);
    }
}

class DemoClass {

    public <T> void genericsMethod(T data){
        System.out.println("Generics Method In Class");
        System.out.println("Passed Data: "+data);
    }
}
