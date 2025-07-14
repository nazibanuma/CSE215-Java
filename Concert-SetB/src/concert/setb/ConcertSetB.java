package concert.setb;

public class ConcertSetB {

    public static void main(String[] args) {
        Performer performer[] = new Performer[2];
        performer[0] = new Performer("DJ Nova", "nova@beats.com");
        performer[1] = new Performer("Luna Echo", "luna@music.com");

        Concert concert[] = new Concert[2];
        concert[0] = new Concert("Midnight Beats", "CN101", performer[0]);
        concert[1] = new Concert("Echo Vibes", "CN102", performer[1]);

        Attendee attendee[] = new Attendee[2];
        attendee[0] = new Attendee("Ayaan", 4123, concert[0]);
        attendee[1] = new Attendee("Zara", 4187, concert[1]);

        attendee[0].attendConcert(concert[0]);
        attendee[1].attendConcert(concert[1]);

        for (int i = 0; i < 2; i++) {
            attendee[i].displayAttendeeInfo();
        }
    }

}
