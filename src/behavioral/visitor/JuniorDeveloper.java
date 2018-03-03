package behavioral.visitor;

public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass prejectClass) {
        System.out.println("Write poor code");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Write poor data structure");
    }

    @Override
    public void create(Test test) {
        System.out.println("Write poor test");
    }
}
