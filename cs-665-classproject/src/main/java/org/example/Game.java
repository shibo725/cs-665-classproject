package org.example;
import java.time.LocalDateTime;

public class Game {
    private LocalDateTime date;
    private String opponent;
    private String location;

    public Game(LocalDateTime date, String opponent, String location) {
        this.date = date;
        this.opponent = opponent;
        this.location = location;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Game{" +
                "date=" + date +
                ", opponent='" + opponent + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
