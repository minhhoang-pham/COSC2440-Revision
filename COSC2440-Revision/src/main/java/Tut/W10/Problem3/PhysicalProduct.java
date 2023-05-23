package Tut.W10.Problem3;

import java.util.ArrayList;
import java.util.List;

public class PhysicalProduct extends Product {
    List<Observer> peopleWhoCare;

    public PhysicalProduct() {
        peopleWhoCare = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        peopleWhoCare.add(observer);
    }

    public void removeObserver(Observer observer) {
        peopleWhoCare.remove(observer);
    }

    @Override
    public void setAmount(int amount) {
        super.setAmount(amount);
        for (Observer observer : peopleWhoCare) {
            if ((observer.getLowerThreshold() < amount) ||
                    observer.getUpperThreshold() > amount) {
                observer.notifyMe(amount);
            }
        }
    }
}
