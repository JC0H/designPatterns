package behavioral.strategy;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setAction(new Sleeping());
        developer.executeAction();
    }
}
