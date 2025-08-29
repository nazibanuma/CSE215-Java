package pingpong;

public class PingPong {

    public static void main(String[] args) {
        Pad pad = new Pad();

        Thread t1 = new Thread(new Writer("PING", 5, pad));
        Thread t2 = new Thread(new Writer("PONG", 5, pad));

        t1.start();
        t2.start();
    }
}

// Do not modify this file.
class Writer implements Runnable {

    private final String token;
    private final int times;
    private final Pad pad;

    public Writer(String token, int times, Pad pad) {
        this.token = token;
        this.times = times;
        this.pad = pad;
    }

    @Override
    public void run() {
        for (int i = 1; i <= times; i++) {
            pad.print(token, i);
        }
    }
}

class Pad {

    private String next = "PING";

    public synchronized void print(String token, int time) {

        if (!token.equals(next)) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(token + ": " + time);

        if (token.equals("PING")) {
            next = "PONG";
        } else {
            next = "PING";
        }

        notifyAll();

    }
}
