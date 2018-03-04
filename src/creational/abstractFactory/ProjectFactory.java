package creational.abstractFactory;

public interface ProjectFactory {
    Developer getDeveloper();
    QATester getQATestter();
    ManageProject getProjectManager();
}
