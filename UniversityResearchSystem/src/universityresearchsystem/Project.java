package universityresearchsystem;

public class Project {

    private String projectCode;
    private String title;
    private LeadResearcher lead;
    private Researcher[] researchers;
    private int maxResearchers;

    public Project(String projectCode, String title, LeadResearcher lead, int maxResearchers) {
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

        if (lead.getTeamSize() >= maxResearchers) {
            System.out.println("Max members reached");
            return false;
        } else {
            for (int i = 0; i < lead.getTeamSize(); i++) {
                if (researchers[i].getResearcherID().equals(r.getResearcherID())) {
                    System.out.println("Researcher already in the team!");
                    return false;
                }

            }
            researchers[lead.getTeamSize()]=r;
            lead.addTeamMember();
            return true;

        }
    }
    
    public int getResearcherCount(){
        return lead.getTeamSize();
    }
    
    public void displayProjectDetails(){
       
        System.out.println("Code: "+projectCode);
        System.out.println("Code: "+title);
         lead.displayResearcherInfo();
         for(int i=0;i<lead.getTeamSize();i++){
             researchers[i].displayResearcherInfo();
             System.out.println("");
         }
        
    }
    
    

}
