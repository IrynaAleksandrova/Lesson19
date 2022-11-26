package task1;

public class Main {
// Создать три потока Т1, Т2 и Т3
// Реализовать выполнение поток в последовательности Т3 -> Т2 -> Т1 (используя метод join).

    public static void main(String[] args) {

        Thread threadFirst = new MyThread("T1");
        Thread threadSecond = new MyThread("T2 -> ");
        Thread threadThird = new MyThread("T3 -> ");

        try {
            threadThird.start();
            threadThird.join();
            threadSecond.start();
            threadSecond.join();
            threadFirst.start();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}