
package universityresearchsystem;


public class Publication {
    private String pubID;
    private String title;
    private Project project;
    private Researcher leadAuthor;


    public Publication(String pubID, String title, Project project, Researcher leadAuthor) {
        this.pubID = pubID;
        this.title = title;
        this.project = project;
        this.leadAuthor = leadAuthor;
    }

    public String getPubID() {
        return pubID;
    }

    public String getTitle() {
        return title;
    }

    public Project getProject() {
        return project;
    }

    public Researcher getLeadAuthor() {
        return leadAuthor;
    }
    
    public void publish(){
        leadAuthor.incrementPublications();
    }
    
    public void displayPublicationInfo(){
        System.out.println("Publication ID: "+pubID);
        System.out.println("Publication title: "+title);
        System.out.println("Publication code: "+project.getProjectCode());
        System.out.println("Publication author name: "+leadAuthor.getName());
    }
    
    
}


