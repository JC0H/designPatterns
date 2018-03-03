package behavioral.state;

public class Sleeping implements Action {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping");
    }
}
