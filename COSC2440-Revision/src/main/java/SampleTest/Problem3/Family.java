package SampleTest.Problem3;

import java.util.ArrayList;
import java.util.List;

public class Family implements FamilyMembers {
    private String name;
    private List<FamilyMembers> familyMembersList;

    public Family(String name) {
        this.name = name;
        this.familyMembersList = new ArrayList<>();
    }

    public void addFamilyMembers (FamilyMembers familyMembers) {
        familyMembersList.add(familyMembers);
    }

    public double getIncome() {
        for (FamilyMembers familyMember : familyMembersList) {
            return familyMember.getIncome();
        }
        return 0;
    }

    @Override
    public double avgIncome() {
        double totalIncome = 0;
        for (FamilyMembers familyMember : familyMembersList) {
            totalIncome += familyMember.getIncome();
        }
        return totalIncome / familyMembersList.size();
    }
}
