package org.example;
import java.util.ArrayList;
import java.util.List;

public class Schedule implements Notifier {
    private static Schedule instance;
    private final List<Game> games;
    private final List<TeamMember> teamMembers;

    private Schedule() {
        games = new ArrayList<>();
        teamMembers = new ArrayList<>();
    }

    public static Schedule getInstance() {
        if (instance == null) {
            instance = new Schedule();
        }
        return instance;
    }

    public void addGame(Game game) {
        games.add(game);
        notifyAllMembers(game, "added");
    }

    public void updateGame(Game oldGame, Game newGame) {
        games.remove(oldGame);
        games.add(newGame);
        notifyAllMembers(newGame, "updated");
    }

    public void removeGame(Game game) {
        games.remove(game);
        notifyAllMembers(game, "removed");
    }

    public List<Game> getGames() {
        return games;
    }

    @Override
    public void notifyAllMembers(Game game, String action) {
        for (TeamMember member : teamMembers) {
            member.notify(game, action);
        }
    }

    @Override
    public void addTeamMember(TeamMember member) {
        teamMembers.add(member);
    }

}
