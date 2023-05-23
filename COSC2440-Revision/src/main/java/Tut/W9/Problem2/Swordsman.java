package Tut.W9.Problem2;

public class Swordsman extends Hero {
    public static final double DISTANCE_ATTACK_RATIO = 0.04;
    public static final double CLOSE_COMBAT_RATIO = 0.35;

    public Swordsman(String name, int strength) {
        super(name, strength);
    }

    @Override
    public double distanceAttack() {
        return strength * DISTANCE_ATTACK_RATIO;
    }

    @Override
    public double closeCombat() {
        return strength * CLOSE_COMBAT_RATIO;
    }
}
