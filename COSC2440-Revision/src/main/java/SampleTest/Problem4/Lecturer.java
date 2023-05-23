package SampleTest.Problem4;

public class Lecturer {
    private String name;
    private boolean hasProject;

    public Lecturer(String name) {
        this.name = name;
        this.hasProject = false;
    }

    public String getName() {
        return name;
    }

    public boolean hasProject() {
        return hasProject;
    }

    public void setProject(boolean hasProject) {
        this.hasProject = hasProject;
    }
}
