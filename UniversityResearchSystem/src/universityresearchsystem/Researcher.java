package universityresearchsystem;

public class Researcher {

    private String researcherID;
    private String name;
    private String email;
    private int publications;

    public Researcher(String researcherID, String name, String email) {
        this.researcherID = researcherID;
        this.name = name;
        this.email = email;
        publications = 0;
    }

    public String getResearcherID() {
        return researcherID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void incrementPublications() {
        publications++;
    }

    public void displayResearcherInfo() {
        System.out.println("Researcher name: " + name);
        System.out.println("Researcher email: " + email);
        System.out.println("Researcher ID: " + researcherID);
        System.out.println("Researcher publication count: " + publications);
    }

}
