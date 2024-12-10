package org.example;

public interface Notifier {
    void notifyAllMembers(Game game, String action);
    void addTeamMember(TeamMember member);
}

