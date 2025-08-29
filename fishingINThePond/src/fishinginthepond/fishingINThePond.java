package fishinginthepond;

public class fishingINThePond {

    public static void main(String args[]) {
        Pond p = new Pond(20000);

        Fishing f1 = new Fishing(3, p);
        Fishing f2 = new Fishing(2, p);

        Thread t1 = new Thread(f1);
        Thread t2 = new Thread(f2);

        t1.start();
        t2.start();
    }
}
