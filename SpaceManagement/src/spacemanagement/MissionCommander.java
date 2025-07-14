package spacemanagement;

public class MissionCommander extends Astronaut {

    private int commandLevel;
    private double teamBudget;

    public MissionCommander(String id, String name, String role, int years, int maxCerts, int level, double budget) {
        super(id, name, years, role, maxCerts);
        if (level <= 1 || level >= 5) {
            commandLevel = level;
        } else {
            commandLevel = 1;
        }
        if (budget > 0) {
            teamBudget = budget;
        } else {
            budget = 0;
        }
    }

    public boolean increaseBudget(double amount) {
        if (amount > 0 && commandLevel <= 3) {
            teamBudget = teamBudget + amount;
            return true;
        } else {
            System.out.println("Error!");
            return false;
        }
    }

    public int getCommandLevel() {
        return commandLevel;
    }

    public double getTeamBudget() {
        return teamBudget;
    }

    public void displayPersonnelInfo() {
        super.displayPersonnelInfo();
        System.out.println("Command Level: " + getCommandLevel());
        System.out.println("Team Budget: " + getTeamBudget());
    }

}
