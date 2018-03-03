package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observed {
    private List<String> vacancies = new ArrayList<>();
    private List<Observer> subscribers = new ArrayList<>();

    public void addVacancies(String name){
        this.vacancies.add(name);
        notifyAllSub();
    }

    public void removeVacancies(String name){
        this.vacancies.remove(name);
        notifyAllSub();
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void notifyAllSub() {
        for (Observer obs : subscribers){
            obs.handleEvent(vacancies);
        }
    }

}
