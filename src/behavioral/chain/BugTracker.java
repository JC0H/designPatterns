package behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier simpleNotifier = new SimpleNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SmsNotifier(Priority.ASAP);

        simpleNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        simpleNotifier.notifyManager("Everything is OK. ", Priority.ROUTINE);
        simpleNotifier.notifyManager("Something went wrong", Priority.IMPORTANT);
        simpleNotifier.notifyManager("Huston, we've have a problem here !!!", Priority.ASAP);

    }
}
