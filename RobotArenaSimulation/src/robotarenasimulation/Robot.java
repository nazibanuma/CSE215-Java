package robotarenasimulation;

public abstract class Robot {

    private String name;
    private int powerLevel;
    private Behaivor behaivor;

    public Robot(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public Behaivor getBehaivor() {
        return behaivor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public void setBehaivor(Behaivor behaivor) {
        this.behaivor = behaivor;
    }

    public void assignRandomBehaivor() {
        int type = (int) (Math.random() * 3 + 1);
        for (int i = 0; i < 3; i++) {
            switch (type) {
                case 1: {
                    behaivor = new Attack();
                    break;
                }
                case 2: {
                    behaivor = new Repair();
                    break;
                }
                case 3: {
                    behaivor = new Heal();
                    break;
                }
            }
        }
    }

    public abstract void describe();

    public void perform() {
        describe();
        System.out.println("Power Level: " + getPowerLevel());
        behaivor.execute();
    }

}
