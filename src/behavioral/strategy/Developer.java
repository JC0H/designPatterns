package behavioral.strategy;

public class Developer {
    Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void executeAction(){
        this.action.justDoIt();
    }
}
