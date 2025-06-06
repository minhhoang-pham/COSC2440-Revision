package Tut.W10.Problem3;

public class ShortRangeObserver implements Observer {
    private final String name;
    private final int LOWER_THRESHOLD = 30;
    private final int UPPER_THRESHOLD = 50;

    public ShortRangeObserver(String name) {
        this.name = name;
    }

    @Override
    public int getUpperThreshold() {
        return UPPER_THRESHOLD;
    }

    @Override
    public int getLowerThreshold() {
        return LOWER_THRESHOLD;
    }

    @Override
    public void notifyMe(int amount) {
        if (amount < LOWER_THRESHOLD) {
            System.out.printf("%s: Amount %d is lower than the threshold %d%n", name, amount, LOWER_THRESHOLD);
        } else if (amount > UPPER_THRESHOLD) {
            System.out.printf("%s: Amount %d is higher than the threshold %d%n", name, amount, UPPER_THRESHOLD);
        }
    }
}
