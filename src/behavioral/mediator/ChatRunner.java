package behavioral.mediator;

public class ChatRunner {
    public static void main(String[] args) {
        SimleTxtChat chat = new SimleTxtChat();

        User admin = new Admin(chat,"admin");
        User user1 = new SimpleUser(chat,"user 1");
        User user2 = new SimpleUser(chat,"user 2");

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);

        user1.sendMessage("Hello, i'm a user1");
        admin.sendMessage("Roger that. I am admin");
    }
}
