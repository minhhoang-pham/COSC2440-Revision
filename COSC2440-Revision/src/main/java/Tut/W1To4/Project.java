package Tut.W1To4;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private double budget;
    private Lecturer leader;
    private List<ProjectMember> members;

    public Project(String name, double budget) {
        this.name = name;
        this.budget = budget;
        this.leader = null;
        this.members = new ArrayList<>();
    }

    /**
     * Add the member to the project ArrayList of members
     * Also add this project to the list of projects joined of the member
     * @param member the member to add, either a lecturer or a full time student
     */
    public void addMember(ProjectMember member) {
        this.members.add(member);
    }

    /**
     * Display the leader and all members of the project
     */
    public void displayMembers() {
        System.out.println("Leader: " + leader);
        System.out.println("Members:");
        for (ProjectMember member : members) {
            System.out.println(member);
        }
    }

    public String getName() {
        return name;
    }

    public void setLeader(Lecturer leader) {
        this.leader = leader;
    }

    public Lecturer getLeader() {
        return leader;
    }

    public double getBudget() {
        return budget;
    }

    public List<ProjectMember> getMembers() {
        return members;
    }
}
