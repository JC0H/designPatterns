package behavioral.state;

public class Developer {
    Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void changeActivity(){
        if (action instanceof Sleeping){
            setAction(new Working());
        }else if (action instanceof Working){
            setAction(new Reading());
        }else if (action instanceof Reading){
            setAction(new Sleeping());
        }
    }

    public void executeActivity(){
        action.justDoIt();
    }
}
