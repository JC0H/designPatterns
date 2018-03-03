package behavioral.command;

public class Developer {
    Command insert;
    Command select;
    Command update;

    public Developer(Command insert, Command select, Command update) {
        this.insert = insert;
        this.select = select;
        this.update = update;
    }

    public void insert(){
        insert.execute();
    }

    public void select(){
        select.execute();
    }

    public void update(){
        update.execute();
    }
}
