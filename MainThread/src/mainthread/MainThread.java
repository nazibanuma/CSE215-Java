package mainthread;

class UnsafeCounter {

    private int value = 0;

    // Not synchronized. Read-modify-write is racy.
   synchronized void increment() {
        int current = value;   // read
//        Thread.yield();        // make the race more likely
        value = current + 1;
        System.out.println("Value: " + value);// write
    }

    int get() {
        return value;
    }
}

// Simple thread class that bumps the counter many times.
class MyThread extends Thread {

    private final UnsafeCounter counter;
    private final int loops;

    MyThread(String name, UnsafeCounter counter, int loops) {
        super(name);
        this.counter = counter;
        this.loops = loops;
    }

    @Override
    public void run() {
        for (int i = 0; i < loops; i++) {
            counter.increment(); // NOT thread-safe
        }
    }
}

public class MainThread {

    public static void main(String[] args) throws InterruptedException {
        UnsafeCounter counter = new UnsafeCounter();
        int loops = 3; // try raising this if the race doesn't show

        // Three threads explicitly:
        Thread t1 = new MyThread("t1", counter, loops);
        Thread t2 = new MyThread("t2", counter, loops);
        Thread t3 = new MyThread("t3", counter, loops);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        int expected = 3 * loops;
        int actual = counter.get();
        System.out.println("expected=" + expected
                + ", actual=" + actual
                + ", lost=" + (expected - actual));
    }
}
