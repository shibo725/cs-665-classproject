package org.example;
import java.util.List;

public interface FilterStrategy {
    List<Game> filter(List<Game> games);
}
