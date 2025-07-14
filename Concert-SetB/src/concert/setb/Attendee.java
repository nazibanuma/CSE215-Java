package concert.setb;

public class Attendee {

    private String attendeeName;
    private int ticketNumber;
    private Concert concert;

    public Attendee(String attendeeName, int ticketNumber, Concert concert) {
        this.attendeeName = attendeeName;
        this.ticketNumber = ticketNumber;
        this.concert = concert;
    }

    public void attendConcert(Concert concert) {
        this.concert = concert;
    }

    public void viewConcertDetails() {
        concert.displayConcertDetails();
    }

    public void displayAttendeeInfo() {
        System.out.println("Name: " + attendeeName);
        System.out.println("Ticket Number: " + ticketNumber);
        concert.displayConcertDetails();
    }
}
