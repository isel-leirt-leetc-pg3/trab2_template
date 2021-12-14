package leirt.pg3.group2.football;

public class Game {
    public final String localTeam;
    public final String visitorTeam;
    public final int localGoals;
    public final int visitorGoals;

    // local : <goals> - visitor : goals
    public static Game from(String desc) {
         // TO IMPLEMENT
        return null;
    }

    public Game(String local, String visitor,
                int localGoals, int visitorGoals) {
        this.localTeam = local;
        this.visitorTeam = visitor;
        this.localGoals = localGoals;
        this.visitorGoals = visitorGoals;
    }
}
