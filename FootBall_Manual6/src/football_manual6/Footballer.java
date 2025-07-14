package football_manual6;

public class Footballer {

    private String name;
    private String team;
    private String position;
    private int matches;
    private int goals;
    private int assists;

    public Footballer() {
        name = null;
        team = null;
        position = null;
        matches = 0;
        goals = 0;
        assists = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public String getPosition() {
        return position;
    }

    public void increaseMatch() {
        matches = matches + 1;
    }

    public void increaseGoals(int goals) {
        this.goals = this.goals + goals;
    }

    public void increaseAssists(int assists) {
        this.assists = this.assists + assists;
    }

    public void compare(Footballer player) {
        if (this.goals > player.goals && this.assists > player.assists) {
            System.out.println(this.name + " has more goals and assists than " + player.getName());
        } else if (this.goals > player.goals && this.assists <= player.assists) {
            System.out.println(this.name + " has more goals but fewer or equal assists than " + player.getName());
        } else if (this.goals <= player.goals && this.assists > player.assists) {
            System.out.println(this.name + " has more assists but fewer or equal goals than " + player.getName());
        } else {
            System.out.println(this.name + " has fewer goals and assists than " + player.getName());
        }

    }

}
