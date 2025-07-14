package concert.setb;

public class Concert {

    private String name;
    private String concertCode;
    private Performer performer;

    public Concert() {

    }

    public Concert(String name, String concertCode, Performer performer) {
        this.name = name;
        this.concertCode = concertCode;
        this.performer = performer;
    }

    public String getName() {
        return name;
    }

    public String getConcertCode() {
        return concertCode;
    }

    public Performer getPerformer() {
        return performer;
    }

    public void displayConcertDetails() {
        System.out.println("name: " + name);
        System.out.println("concert code: " + concertCode);
        performer.showPerformerInfo();
    }

}
