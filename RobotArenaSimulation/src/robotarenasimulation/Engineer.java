package robotarenasimulation;

public class Engineer extends Robot {

    public Engineer(String name, int powerLevel) {
        super(name, powerLevel);
    }

    public void describe() {
        System.out.println("This is a Engineer robot!");
    }
}
