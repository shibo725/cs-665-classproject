package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Schedule schedule = Schedule.getInstance();

        // Adding team members
        TeamMember shibo = new TeamMember("shibo");
        TeamMember leo = new TeamMember("leo");
        schedule.addTeamMember(shibo);
        schedule.addTeamMember(leo);

        // Adding games
        Game game1 = new Game(LocalDateTime.of(2024, 12, 10, 18, 30), "Team A", "Boston Arena");
        Game game2 = new Game(LocalDateTime.of(2024, 12, 15, 20, 0), "Team B", "Harvard Gym");

        schedule.addGame(game1);
        schedule.addGame(game2);

        // Updating a game
        Game updatedGame1 = new Game(LocalDateTime.of(2024, 12, 10, 19, 0), "Team A", "Boston Arena");
        schedule.updateGame(game1, updatedGame1);

        // Removing a game
        schedule.removeGame(game2);

        // Filtering games
        FilterStrategy dateFilter = new DateFilter(LocalDateTime.of(2024, 12, 10, 0, 0));
        System.out.println("Games on Dec 10: " + dateFilter.filter(schedule.getGames()));

        FilterStrategy opponentFilter = new OpponentFilter("Team A");
        System.out.println("Games against Team A: " + opponentFilter.filter(schedule.getGames()));
    }
}
