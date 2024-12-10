package org.example;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class DateFilter implements FilterStrategy {
    private final LocalDateTime date;

    public DateFilter(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public List<Game> filter(List<Game> games) {
        return games.stream()
                .filter(game -> game.getDate().toLocalDate().equals(date.toLocalDate()))
                .collect(Collectors.toList());
    }
}

