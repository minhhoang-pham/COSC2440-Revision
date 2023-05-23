package Tut.W1To4;

import java.util.HashSet;
import java.util.Set;

public class LeaderSet {
    private Set<Lecturer> leader;

    public LeaderSet() {
        this.leader = new HashSet<>();
    }

    public void addLeader(Lecturer leader) {
        this.leader.add(leader);
    }

    public void removeLeader(Lecturer leader) {
        this.leader.remove(leader);
    }
}
