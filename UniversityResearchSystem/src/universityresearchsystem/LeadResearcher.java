package universityresearchsystem;

public class LeadResearcher extends Researcher {

    private int teamSize;
    private double projectFund;

    public LeadResearcher(String researcherID, String name, String email, int teamSize, double projectFund) {
        super(researcherID, name, email);
        this.teamSize = teamSize;
        this.projectFund = projectFund;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public double getProjectFund() {
        return projectFund;
    }

    public void addTeamMember() {
        this.teamSize++;
    }

    public void increaseFund(double amount) {
        if (amount > 0) {
            projectFund = projectFund + amount;
        } else {
            System.out.println("Error");
        }
    }

    public void displayResearcherInfo() {
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Fund: " + projectFund);
        super.displayResearcherInfo();
//        System.out.println("Project Fund: "+super.getName());
//        System.out.println("Project Fund: "+super.getEmail());
    }

}
