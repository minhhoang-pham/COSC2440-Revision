package Tut.W1To4;

public class FullTimeStudent extends Student implements ProjectMember{
    private String profile;

    public FullTimeStudent(String studentId, String name, String major) {
        super(studentId, name, major);
        this.profile = "";
    }

    /**
     * Add the student to the project
     * @param p project that the full time student is added to
     */
    public void joinProject(Project p) {
        p.addMember(this);
    }

    @Override
    public String toString() {
        return String.format("Full-time Student: %s", super.toString());
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
        return super.getStudentId();
    }
}
