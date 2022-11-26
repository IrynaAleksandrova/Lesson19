package task3;

public class Main {
    //    Напишите многопоточный ограниченный буфер с использованием synchronized.

    public static void main(String[] args) {
        SynchronizedClass synchronizedClassClass = new SynchronizedClass();
        Hacker hacker = new Hacker(synchronizedClassClass);
        User user = new User(synchronizedClassClass);
        Thread hackThread = new Thread(hacker);
        Thread userThread = new Thread(user);
        hackThread.start();
        userThread.start();
    }
}
