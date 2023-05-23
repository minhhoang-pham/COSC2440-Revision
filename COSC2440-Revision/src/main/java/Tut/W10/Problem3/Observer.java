package Tut.W10.Problem3;

public interface Observer {
    int getUpperThreshold();
    int getLowerThreshold();
    void notifyMe(int amount);
}
