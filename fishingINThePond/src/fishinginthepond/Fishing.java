package fishinginthepond;

public class Fishing implements Runnable {

    int try_count;
    Pond p;

    public Fishing(int try_count, Pond p) {
        this.try_count = try_count;
        this.p = p;
    }

    public void run() {
        p.catching(try_count);
    }
}
