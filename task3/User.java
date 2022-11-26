package task3;

public class User implements Runnable {
    SynchronizedClass CLASS;

    public User(SynchronizedClass cl) {
        CLASS = cl;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            CLASS.putInfo();
        }
    }
}