package behavioral.state;

public class StateRuning {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setAction(new Sleeping());

        for (int i = 0; i < 10; i++){
            developer.executeActivity();
            developer.changeActivity();
        }
    }
}
