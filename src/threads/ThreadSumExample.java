package threads;

import java.util.Arrays;
import java.util.Random;

public class ThreadSumExample {

    public static void main(String[] args) {
        int[] numbers = generateNumbersArray(100);
        int[] firstHalf = Arrays.copyOfRange(numbers, 0, numbers.length / 2);
        int[] secondHalf = Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length);

        SumThread firstThread = new SumThread(firstHalf, "First Thread");
        SumThread secondThread = new SumThread(secondHalf, "Second Thread");

        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = firstThread.getSum() + secondThread.getSum();
        System.out.println("Toplam Sonuc: " + totalSum);
    }

    private static int[] generateNumbersArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100); // 0-99 arası rastgele sayılar
        }
        return numbers;
    }
}

class SumThread extends Thread {
    private int[] numbers;
    private int sum;
    private String threadName;

    public SumThread(int[] numbers, String threadName) {
        this.numbers = numbers;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int number : numbers) {
            sum += number;
            System.out.println(threadName);
        }
    }

    public int getSum() {
        return sum;
    }
}
