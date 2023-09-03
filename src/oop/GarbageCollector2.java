package oop;

public class GarbageCollector2 {

    protected void finalize() {
        System.out.println("Object is garbage Collected");
    }

    public static void main(String[] args) {
        GarbageCollector2 gc1 = new GarbageCollector2();
        GarbageCollector2 gc2 = new GarbageCollector2();
        gc1 = null;
        gc2 = null;
        System.gc();
    }
}
