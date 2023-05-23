package Tut.W9.Problem3;

public interface Observer {
    int getUpperThreshold();
    int getLowerThreshold();
    void notifyMe(int amount);
}
