package threads;

class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread is running.");
    }
}

public class ThreadClassextend {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
    }
}
