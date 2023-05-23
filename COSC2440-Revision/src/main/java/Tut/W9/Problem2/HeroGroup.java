package Tut.W9.Problem2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HeroGroup extends Hero {
    protected List<Hero> heroList;

    public HeroGroup() {
        super("", 0);
        this.heroList = new ArrayList<>();
    }

    public void addHero(Hero hero) {
        heroList.add(hero);
    }

    @Override
    public double distanceAttack() {
        double sum = 0;
        Iterator<Hero> heroIterator = heroList.iterator();
        while (heroIterator.hasNext()) {
            sum += heroIterator.next().distanceAttack();
        }
        return sum;
    }

    @Override
    public double closeCombat() {
        double sum = 0;
        Iterator<Hero> heroIterator = heroList.iterator();
        while (heroIterator.hasNext()) {
            sum += heroIterator.next().closeCombat();
        }
        return sum;
    }
}
