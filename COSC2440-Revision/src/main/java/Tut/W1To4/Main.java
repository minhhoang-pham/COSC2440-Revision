package Tut.W1To4;

public class Main {
    public static void main(String[] args) {
        ProjectMember s001 = new FullTimeStudent("s001", "Albert", "Information Technology");
        ProjectMember s002 = new FullTimeStudent("s002", "Daniel", "Finance");
        ProjectMember s003 = new FullTimeStudent("s003", "Connor", "Media");
        ProjectMember l001 = new Lecturer("l001", "Tri", "Associate Lecturer");
        ProjectMember l002 = new Lecturer("l002", "Trung", "Associate Lecturer");
        Project p001 = new Project("Master Research", 100000);

        if (((Lecturer) l001).leadProject(p001)) {
            System.out.println("Lecturer " + ((Lecturer) l001).getName() + " has been assigned to " + p001.getName());
            p001.addMember(s001);
            p001.addMember(s002);
            p001.addMember(l002);
            p001.displayMembers();
        }

        StudentGroup sgroup = new StudentGroup();
        sgroup.addStudent((Student) s001);
        sgroup.addStudent((Student) s002);
        sgroup.displayAll();
    }
}
