package task3;

public class Hacker implements Runnable {
    SynchronizedClass CLASS;

    public Hacker(SynchronizedClass cl) {
        CLASS = cl;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            CLASS.extractInfo();
        }
    }
}
