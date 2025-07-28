package fantasytounament;

public class Mage extends Player {

    public Mage(String name, int level, Skill skill) {
        super(name, level, skill);
    }

    public void attack() {
        System.out.println("Mage is attacking");
    }

    public void defend() {
        System.out.println("Mage is defending");
    }
}
