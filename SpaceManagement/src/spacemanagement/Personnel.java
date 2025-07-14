package spacemanagement;

public class Personnel {

    private String personnelID;
    private String name;
    private String role;
    private int experienceYears;

    public Personnel(String personnelID, String name, String role, int years) {
        this.personnelID = personnelID;
        this.name = name;
        this.role = role;
        years = experienceYears;
    }

    public String getPersonnelID() {
        return personnelID;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void updateExperience(int years) {
        if (years > 0) {
            years++;
        } else {
            System.out.println("Error! Year can not be negative!");
        }
    }

    public void displayPersonnelInfo() {
        System.out.println("ID: " + getPersonnelID());
        System.out.println("Name: " + getName());
        System.out.println("Role: " + getRole());
        System.out.println("Years: " + getExperienceYears());
    }
}
