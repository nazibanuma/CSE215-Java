package array;

public class Team {

    private String team;
    private String coach;
    private String country;
    private String[] player;
    private int numplayers;
    private final int maxplayer = 7;

    public Team() {
        team = "";
        coach = "";
        country = "";
        player = new String[maxplayer];
        numplayers = 0;
    }

    public Team(String team, String coach, String country) {
        this.team = team;
        this.coach = coach;
        this.country = country;
        player = new String[maxplayer];
        numplayers = 0;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addPlayers(String playerName) {

        if (numplayers < maxplayer) {
            player[numplayers] = playerName;
            numplayers++;
        } else {
            System.out.println("No more can be added");
        }
    }

    public void removePlayers(String playerName) {
        boolean found = false;
        for (int i = 0; i < numplayers; i++) {
            if (player[i].equals(playerName)) {
                player[i] = player[numplayers - 1];
                numplayers--;
                found = true;
                break;
            }

        }
        if (found == true) {
            System.out.println("player deleted");
        } else {
            System.out.println("not found");
        }
    }
    
    public void removePlayers(int index) {
        if(index >= numplayers){
            System.out.println("index out of bound");
        }
        else{
            player[index] = player[numplayers-1];
            numplayers--;
            System.out.println("Players deleted");
        }
        
    }
    
    public void printInfo(){
        
        System.out.println("Team: "+team);
        System.out.println("Coach: "+coach);
        System.out.println("Country: "+country);
        
        for(int i=0;i< numplayers;i++){
            System.out.println("Player "+(i+1)+": "+player[i]);
        }
        
        System.out.println("\n");
        
        
    }
}

