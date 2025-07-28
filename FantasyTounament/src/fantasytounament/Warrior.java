package fantasytounament;

public class Warrior extends Player {

    Warrior(String name, int level,Skill skill) {
        super(name, level, skill);
    }

    public void attack() {
        System.out.println(getName() + " swings a mighty sword!");
    }

    public void defend() {
        System.out.println(getName() + " blocks with a heavy shield!");
    }
}
