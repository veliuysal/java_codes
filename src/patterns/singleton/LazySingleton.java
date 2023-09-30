package patterns.singleton;

class LazySingletonInstance {
    private static LazySingletonInstance instance;

    private LazySingletonInstance(){}

    public static LazySingletonInstance getInstance(){

        if (instance == null){
            System.out.println("instance is null");
            instance = new LazySingletonInstance();
        }

        return instance;
    }

}

public class LazySingleton {
    public static void main(String[] args) {
        LazySingletonInstance instance1 = LazySingletonInstance.getInstance();
        LazySingletonInstance instance2 = LazySingletonInstance.getInstance();
        System.out.println("instance1: "+instance1);
        System.out.println("instance2: "+instance2);
        System.out.println(instance1 == instance2);
    }
}
