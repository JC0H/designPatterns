package behavioral.state;

public class Working implements Action {
    @Override
    public void justDoIt() {
        System.out.println("Working");
    }
}
