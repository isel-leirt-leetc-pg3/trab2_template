package leirt.pg3.group2.football;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ScoreBoard {
    private final Map<String,Team> board;

    public ScoreBoard() {
        board = new HashMap<>();
    }

    public void loadFrom(String gamesFileName)
            throws IOException  {
        // TO IMPLEMENT
    }

    public void addGame(Game game) {
        // TO IMPLEMENT
    }


    public <C extends Collection<Team>>
    SortedMap<Integer, C> toSortedTable(Supplier<C> supplier) {
        // TOM IMPLEMENT
        return null;
    }

    public static  <C extends Collection<Team>>
    void processTable(SortedMap<Integer, C> table,
                      BiConsumer<Integer,Team> action) {
       // TO IMPLEMENT
    }

    public void saveOn(String tableFileName) throws IOException {
        // TO IMPLEMENT
    }

    /**
     * for debug purposes
     */
    void show() {
        List<Team> teams = new ArrayList<>();
        board.values().forEach(t -> teams.add(t));
        teams.sort(Comparator.comparingInt(Team::getPoints));
        System.out.format("%-14s%-8s%-8s%-8s%-8s%-8s%-8s%-8s\n",
            "Name",
            "Points",
            "Games",
            "Winners",
            "Draws",
            "Defeats",
            "Scored",
            "Conceded");
        teams.forEach(System.out::println);
    }
}
