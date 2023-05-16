package SampleTest.Problem3;

public class Main {
    public static void main (String[] args) {
        FamilyMembers p1 = new Person("Tri", 1000.0);
        FamilyMembers p2 = new Person("Dang", 2000.0);
        FamilyMembers f = new Family("Further");
        System.out.println(p1.avgIncome()); // 1000.0
        ((Family) f).addFamilyMembers(p1);
        ((Family) f).addFamilyMembers(p2);
        System.out.println(f.avgIncome()); // 1500.0
        FamilyMembers f2 = new Family("Programming");
        ((Family) f2).addFamilyMembers(f);
        FamilyMembers p3 = new Person("Tran", 3000.0);
        ((Family) f2).addFamilyMembers(p3);
        System.out.println(f2.avgIncome());

    }
}
