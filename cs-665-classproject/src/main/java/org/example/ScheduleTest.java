package org.example;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class ScheduleTest {

    @Test
    public void testAddGame() {
        Schedule schedule = Schedule.getInstance();
        Game game = new Game(LocalDateTime.of(2024, 12, 10, 18, 30), "Team A", "Boston Arena");

        schedule.addGame(game);
        assertEquals(1, schedule.getGames().size());
    }

    @Test
    public void testFilterByDate() {
        Schedule schedule = Schedule.getInstance();
        Game game = new Game(LocalDateTime.of(2024, 12, 10, 18, 30), "Team A", "Boston Arena");
        schedule.addGame(game);

        FilterStrategy dateFilter = new DateFilter(LocalDateTime.of(2024, 12, 10, 0, 0));
        assertEquals(1, dateFilter.filter(schedule.getGames()).size());
    }
}
