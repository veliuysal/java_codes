package patterns.singleton;

class EagerSingletonInstance {
    private static EagerSingletonInstance instance = new EagerSingletonInstance();
    private EagerSingletonInstance(){
        //Empty
    }
    public  static  EagerSingletonInstance getInstance(){
        return instance;
    }
}

public class EagerSingleton {
    public static void main(String[] args) {
        EagerSingletonInstance instance = EagerSingletonInstance.getInstance();
        System.out.println("Eager Singleton instance created...");
    }
}
