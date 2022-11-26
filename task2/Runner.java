package task2;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
    private int count = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    private void increment() {
        for (int i = 0; i < 12345; i++)
            count++;
    }

    public void firstThread() throws InterruptedException {
        lock.lock();
        System.out.println("We start execution secondThread");
        condition.await();
        System.out.print("Increment output... ");
        try {
            increment();
        } finally {
            lock.unlock();
        }
    }

    public void secondThread() throws InterruptedException {
        Thread.sleep(200);
        lock.lock();
        System.out.println("Press ENTER to continue");
        new Scanner(System.in).nextLine();
        System.out.println("Waiting ------> return to firstThread");
        condition.signal();
        try {
            increment();
        } finally {
            lock.unlock();
        }
    }

    public void finished() {
        System.out.print(count);
    }
}
