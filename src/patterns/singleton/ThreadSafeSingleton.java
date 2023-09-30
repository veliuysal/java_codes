package patterns.singleton;

class ThreadSafeSingletonInstance {
    private static ThreadSafeSingletonInstance instance;

    private ThreadSafeSingletonInstance() {
        // private constructor
    }

    public static synchronized ThreadSafeSingletonInstance getInstance() {
        if (instance == null) {
            System.out.println("instance is null");
            instance = new ThreadSafeSingletonInstance();
        }
        return instance;
    }

}

public class ThreadSafeSingleton {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            ThreadSafeSingletonInstance singleton = ThreadSafeSingletonInstance.getInstance();
            System.out.println("Thread 1 Singleton instance created.");
        });

        Thread thread2 = new Thread(() -> {
            ThreadSafeSingletonInstance singleton = ThreadSafeSingletonInstance.getInstance();
            System.out.println("Thread 2 Singleton instance created.");
        });

        thread1.start();
        thread2.start();
    }
}
