package Tut.W1To4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectMemberMap {
    private Map<String, List<Project>> memberToProjectsMap;

    public ProjectMemberMap() {
        this.memberToProjectsMap = new HashMap<>();
    }

    public List<Project> getAllProjects(ProjectMember member) {
        return memberToProjectsMap.get(member.getId());
    }

    public boolean addProjectToMember(ProjectMember member, Project project) {
        ArrayList<Project> projects = (ArrayList<Project>) getAllProjects(member);
        if (projects == null) {
           projects = new ArrayList<>();
        }
        if (projects.contains(project)) {
            return false;
        }
        projects.add(project);
        memberToProjectsMap.put(member.getId(), projects);
        return true;
    }

    public boolean removeProjectFromMember(ProjectMember member, Project project) {
        ArrayList<Project> projects = (ArrayList<Project>) getAllProjects(member);
        if (projects == null) {
            return false;
        }
        if (projects.contains(project)) {
            projects.remove(project);
            memberToProjectsMap.put(member.getId(), projects);
            return true;
        }
        return false;
    }

    public List<Project> getAllSortedProjects(ProjectMember member) {
        List<Project> projects = getAllProjects(member);
        if (projects != null) {
            projects.sort(new SortByBudget());
        }

        return projects;
    }
}
