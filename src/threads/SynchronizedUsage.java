package threads;

public class SynchronizedUsage {

    private int count;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) {
        SynchronizedUsage usage = new SynchronizedUsage();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                if(i%1000 ==0)
                    System.out.println("Thread1");
                usage.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                if(i%1000 ==0)
                    System.out.println("Thread2");
                usage.increment();
            }
        });

        thread1.start();
        thread2.start();
        try{
          thread1.join();
          thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Sonuc: "+usage.count);
    }
}
