package threads;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable is running.");

    }
}

public class RunnableThread {
    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable();
        Thread thread= new Thread(myRunnable);
        thread.start();
    }
}
