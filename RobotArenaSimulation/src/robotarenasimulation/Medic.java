package robotarenasimulation;

public class Medic extends Robot {

    public Medic(String name, int powerLevel) {
        super(name, powerLevel);
    }

    public void describe() {
        System.out.println("This is a Fighter robot!");
    }
}
