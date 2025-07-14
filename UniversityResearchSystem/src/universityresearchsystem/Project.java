package universityresearchsystem;

public class Project {

    private String projectCode;
    private String title;
    private LeadResearcher lead;
    private Researcher researchers[];
    private int maxResearchers;

    public Project(String projectCode, String title, LeadResearcher[] lead, int maxResearchers) {
        this.projectCode = projectCode;
        this.title = title;
        this.lead = lead;
        this.maxResearchers = maxResearchers;
        researchers = new Researcher[maxResearchers];
    }

    public String getProjectCode() {
        return projectCode;
    }

    public String getTitle() {
        return title;
    }

    public LeadResearcher getLead() {
        return lead;
    }

    public boolean addReseachers(Researcher r) {
        if ((lead.getTeamSize() < r[maxResearchers]) && (r.getResearcherID() != researchers.getgetResearcherID())  {

        }
    }

}
