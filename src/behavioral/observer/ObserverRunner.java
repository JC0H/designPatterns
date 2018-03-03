package behavioral.observer;

public class ObserverRunner {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();

        jobSite.addVacancies("Java Junior");
        jobSite.addVacancies("Java Middle");

        Observer firstSubscriber = new Subscriber("John");
        Observer secondSubscriber = new Subscriber("Nick");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancies("Java Senior");
    }
}
