package behavioral.chain;

public class EmailNotifier extends Notifier{

    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("Sending email notification " + massage);
    }
}
