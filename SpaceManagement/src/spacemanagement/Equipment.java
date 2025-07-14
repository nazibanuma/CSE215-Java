package spacemanagement;

public class Equipment {

    private String equipID;
    private String description;
    private double cost;
    private Personnel assignedTo = null;

    public Equipment(String id, String desc, double cost) {
        id = equipID;
        desc = description;
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 0;
        }
    }

    public String getEquipID() {
        return equipID;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public Personnel getAssignedTo() {
        return assignedTo;
    }

    public void assignToPersonnel(Personnel p) {
        assignedTo = p;
    }

    public void displayEquipmentInfo() {
        System.out.println("Id: " + getEquipID());
        System.out.println("Description: " + getDescription());
        System.out.println("Cost: " + getCost());
        if (getAssignedTo() != null) {
            System.out.println("Assignted to: " + getAssignedTo());
        } else {
            System.out.println("Unassignted!");
        }
    }

}
