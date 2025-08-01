package combatant;

public abstract class Combatant extends SpecialMovePerformer {

    private String name;
    private int health;

    public Combatant(String name, int health) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
    }

    public void recover() {
        health = 100;
    }
    
    public void healthDeplete(int damage){
        health = health - damage;
    }

    public abstract void performSpecialMove(Combatant k);

}
