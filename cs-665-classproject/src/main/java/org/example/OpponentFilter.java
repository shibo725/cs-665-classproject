package org.example;
import java.util.List;
import java.util.stream.Collectors;

public class OpponentFilter implements FilterStrategy {
    private final String opponent;

    public OpponentFilter(String opponent) {
        this.opponent = opponent;
    }

    @Override
    public List<Game> filter(List<Game> games) {
        return games.stream()
                .filter(game -> game.getOpponent().equalsIgnoreCase(opponent))
                .collect(Collectors.toList());
    }
}

