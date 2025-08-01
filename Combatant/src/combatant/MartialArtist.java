package combatant;

public class MartialArtist extends Combatant {

    public MartialArtist(String name, int health) {
        super(name, health);
    }

    public void performSpecialMove(Combatant k) {
        int afterdamage = k.getHealth() - (8 + (int) (11 * Math.random()));
        k.healthDeplete(afterdamage);
        System.out.println(getName() + " has has caused " + afterdamage + " points to " + k.getName() + " by Jawan Punch");

        if (k.getHealth() <= 0) {
            System.out.println(getHealth() + " wins!");
        }
    }
}
