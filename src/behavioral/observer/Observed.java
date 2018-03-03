package behavioral.observer;

public interface Observed {

    void removeObserver(Observer observer);

    void addObserver(Observer observer);

    void notifyAllSub();
}
