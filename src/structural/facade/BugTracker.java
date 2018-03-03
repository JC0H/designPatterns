package structural.facade;

public class BugTracker {
    private boolean acticity = false;

    public boolean isActicity() {
        return acticity;
    }

    public void startSprint(){
        System.out.println("Sprint is active");
        acticity = true;
    }

    public void finishSprint(){
        System.out.println("Sprint is not active");
        acticity = false;
    }

}
