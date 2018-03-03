package structural.facade;

public class Developer {
    public void doJob(BugTracker bugTracker){
        if (bugTracker.isActicity()){
            System.out.println("Writing code");
        }else {
            System.out.println("Developer eating");
        }
    }
}
