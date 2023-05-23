package Tut.W9.Problem2;

public class Main {
    public static void main(String[] args) {
        Hero bowMan = new Bowman("Alice", 100);
        Hero swordsMan = new Swordsman("Bob", 200);

        HeroGroup smallGroup = new HeroGroup();
        smallGroup.addHero(bowMan);
        smallGroup.addHero(swordsMan);

        HeroGroup bigGroup = new HeroGroup();
        bigGroup.addHero(bowMan);
        bigGroup.addHero(swordsMan);
        bigGroup.addHero(smallGroup);

        System.out.printf("distanceAttack for bowMan: %.2f\n", bowMan.distanceAttack());
        System.out.printf("distanceAttack for swordsMan: %.2f\n", swordsMan.distanceAttack());
        System.out.printf("distanceAttack for smallGroup: %.2f\n", smallGroup.distanceAttack());
        System.out.printf("distanceAttack for bigGroup: %.2f\n", bigGroup.distanceAttack());
    }
}
