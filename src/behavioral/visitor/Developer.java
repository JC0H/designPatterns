package behavioral.visitor;

public interface  Developer {
    void create(ProjectClass prejectClass);

    void create(DataBase dataBase);

    void create(Test test);
}
