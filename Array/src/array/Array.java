package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Team team1 = new Team("Brazil", "carlos", "Brazil");
        team1.addPlayers("Neymar");
        team1.addPlayers("Ronaldinho");
        team1.addPlayers("Pele");
        team1.addPlayers("Ronaldo");

        team1.printInfo();

        team1.removePlayers("Neymar");
        team1.removePlayers(2);

        team1.printInfo();

    }

}
