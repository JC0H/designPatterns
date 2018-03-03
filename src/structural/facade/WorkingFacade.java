package structural.facade;

public class WorkingFacade {
    Job job = new Job();
    Developer developer =  new Developer();
    BugTracker bugTracker = new BugTracker();

    public void workingDay(){
        job.justDoIt();
        bugTracker.startSprint();
        developer.doJob(bugTracker);

    }
}
