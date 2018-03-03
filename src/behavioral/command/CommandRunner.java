package behavioral.command;

public class CommandRunner {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Developer dev = new Developer(
                new InsertCommand(dataBase),
                new SelectCommand(dataBase),
                new UpdateCommand(dataBase)
        );

        dev.update();
        dev.select();
        dev.insert();
    }
}
