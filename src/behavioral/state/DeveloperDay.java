package behavioral.state;

public class DeveloperDay {
    public static void main(String[] args) {
        Action action = new Sleep();
        Developer developer = new Developer();

        developer.setAction(action);

        for (int i = 0; i < 10; i++) {
            developer.perfomance();
            developer.changeActivity();
        }
    }
}
