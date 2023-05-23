package Tut.W5.Problem3;



public class FullTimeStudent extends Student implements ProjectMember {
    private String profile;

    public FullTimeStudent(String studentId, String name, String major, double gpa) {
        super(studentId, name, major, gpa);
        this.profile = "";
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
