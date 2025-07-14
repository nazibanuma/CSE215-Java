package football_manual6;

public class FootBall_Manual6 {

    public static void main(String[] args) {
        Footballer player1 = new Footballer();
        Footballer player2 = new Footballer();

        player1.setName("Kylian Mbappe");
        player1.setTeam("PSG");
        player1.setPosition("Left-Winger");

        player2.setName("Ering Haaland");
        player2.setTeam("Manchester City");
        player2.setPosition("Center-Forward");

        player1.increaseMatch();
        player1.increaseAssists(0);
        player1.increaseGoals(2);

        player1.increaseMatch();
        player1.increaseAssists(0);
        player1.increaseGoals(3);

        player1.increaseMatch();
        player1.increaseAssists(2);
        player1.increaseGoals(2);

        player2.increaseMatch();
        player2.increaseAssists(1);
        player2.increaseGoals(2);

        player2.increaseMatch();
        player2.increaseAssists(1);
        player2.increaseGoals(2);

        player2.increaseMatch();
        player2.increaseAssists(2);
        player2.increaseGoals(2);

        player1.compare(player2);
        
    
    }

}
