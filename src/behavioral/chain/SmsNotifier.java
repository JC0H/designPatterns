package behavioral.chain;

public class SmsNotifier extends Notifier {

    public SmsNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("Sms notification! Emergency " + massage);
    }
}
