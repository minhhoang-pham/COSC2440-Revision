package Tut.W10.Problem2;

public class Bowman extends Hero {
    public static final double DISTANCE_ATTACK_RATIO = 0.3;
    public static final double CLOSE_COMBAT_RATIO = 0.05;

    public Bowman(String name, int strength) {
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
