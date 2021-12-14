package leirt.pg3.group2.football;

public class Team {
    private final String name;

    // counters
    private int scored;
    private int conceded;
    private int defeats;
    private int draws;
    private int victories;


    public Team(String name) {
        this.name = name;
    }

    public void addGame(int scored, int conceded) {
        // TO IMPLEMENT
    }

    public int playedGames() {
        // TO IMPLEMENT
        return 0;
    }

    public int getPoints() {
        // TO IMPLEMENT
        return 0;
    }

    public int getScored() {
        return scored;
    }

    public int getConceded() {
        return conceded;
    }

    public int getDefeats() {
        return defeats;
    }

    public int getDraws()   {
        return draws;
    }

    public int getVictories() {
        return victories;
    }

    public String getName() {
        return name;
    }

    public int diffGoals() {
        return scored - conceded;
    }

    public String toString() {
        return String.format("%-10s%8d%8d%8d%8d%8d%8d%8d",
            getName(),
            getPoints(),
            playedGames(),
            getVictories(),
            getDraws(),
            getDefeats(),
            getScored(),
            getConceded());
    }
}
