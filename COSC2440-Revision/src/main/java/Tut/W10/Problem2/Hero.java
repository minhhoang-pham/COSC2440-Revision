package Tut.W10.Problem2;

public abstract class Hero {
    protected String name;
    protected int strength;

    public Hero(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public abstract double distanceAttack();

    public abstract double closeCombat();
}
