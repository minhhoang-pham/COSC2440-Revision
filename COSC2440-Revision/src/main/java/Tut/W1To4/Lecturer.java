package Tut.W1To4;

public class Lecturer implements ProjectMember{
    private String lecturerId;
    private String name;
    private String rank;
    private Project leadProject;
    private String profile;

    public Lecturer(String lecturerId, String name, String rank) {
        this.lecturerId = lecturerId;
        this.name = name;
        this.rank = rank;
        this.leadProject = null;
        this.profile = "";
    }

    /**
     * Check if the lecturer is not leading any other projects. If not then assign the lecturer to lead the project
     * @param p Project to assign the lecturer to lead
     * @return boolean value, true if the lecturer meets the requirement and is assigned to lead the project
     */
    public boolean leadProject(Project p) {
        if (this.leadProject == null && p.getLeader() == null) {
            this.leadProject = p;
            p.setLeader(this);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Add the lecturer as a member to the project
     * @param p project that the lecturer is added to as a member
     */
    public void joinProject(Project p) {
        p.addMember(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Lecturer: ID: %s, Name: %s, Rank: %s", lecturerId, name, rank);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof Lecturer)) {
            return false;
        }

        return this.lecturerId.equals(((Lecturer) other).lecturerId);
    }

    @Override
    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String getProfile() {
        return this.profile;
    }

    @Override
    public String getId() {
        return lecturerId;
    }
}
