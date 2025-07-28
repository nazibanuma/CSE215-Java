package fantasytounament;

public abstract class Player {

    public Player(String name, int level, Skill skill) {
        this.name = name;
        this.level = (int) (Math.random() * 5 + 1);
        this.skill = skill;
    }

    private String name;
    private int level;
    Skill skill;

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public abstract void attack();

    public abstract void defend();

    public void assignSkill() {
        int randomskill = (int) (Math.random() * 2 + 1);

        switch (randomskill) {
            case 1: {
                skill = new Shield();
                break;
            }
            case 2: {
                skill = new SpecialAttack();
                break;
            }
        }
    }

    public void performSkill() {
        skill.useSkill();
    }

    public void perform() {
        attack();
        defend();
        performSkill();
    }
//    public int type(){
//    int type = (int) (Math.random() * 3);
//        switch (type) {
//            case 0:
//                return new Warrior(name, level, skill);
//            case 1: 
//                return new Mage(name, level, skill);
//            default: 
//                return new Archer(name, level, skill);
//        }
//    }

}
