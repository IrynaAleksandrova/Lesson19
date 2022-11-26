package task1;

public class MyThread extends Thread {
    private final String NAME;

    public MyThread(String name) {
        this.NAME = name;
    }

    @Override
    public void run() {
        System.out.print(NAME);
    }

}
