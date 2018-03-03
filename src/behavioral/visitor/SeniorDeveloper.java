package behavioral.visitor;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewrite poor code after junior write it");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Rewrite good data structure");
    }

    @Override
    public void create(Test test) {
        System.out.println("Rewrite good testing system");
    }
}
