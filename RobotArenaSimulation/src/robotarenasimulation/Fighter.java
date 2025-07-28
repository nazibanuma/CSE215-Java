package robotarenasimulation;

public class Fighter extends Robot {

    public Fighter(String name, int powerLevel) {
        super(name, powerLevel);
    }

    public void describe() {
        System.out.println("This is a Fighter robot!");
    }
}
