package concert.setb;

public class Performer {

    private String stageName;
    private String email;

    public Performer() {

    }

    public Performer(String stageName, String email) {
        this.stageName = stageName;
        this.email = email;
    }

    public String getStageName() {
        return stageName;
    }

    public String getEmail() {
        return email;
    }

    public void showPerformerInfo() {
        System.out.println("Stage name: " + stageName + "\n" + "Email: " + email);
    }

}
