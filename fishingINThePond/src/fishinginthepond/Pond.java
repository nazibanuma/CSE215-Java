package fishinginthepond;

public class Pond {

    private int TotalF;

    Pond(int TotalF) {
        this.TotalF = TotalF;
    }

    public synchronized void catching(int try_count) {

        for (int i = 0; i < try_count; i++) {
            TotalF -= 1000;
            System.out.println(TotalF + " fishes left in the pond");
        }

    }
}
