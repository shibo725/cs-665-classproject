package org.example;
public class TeamMember {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    public void notify(Game game, String action) {
        System.out.println("Notification to " + name + ": Game " + action + ": " + game);
    }
}

