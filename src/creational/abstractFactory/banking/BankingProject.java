package creational.abstractFactory.banking;

import creational.abstractFactory.Developer;
import creational.abstractFactory.ManageProject;
import creational.abstractFactory.ProjectFactory;
import creational.abstractFactory.QATester;

public class BankingProject implements ProjectFactory{

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public QATester getQATestter() {
        return new Tester();
    }

    @Override
    public ManageProject getProjectManager() {
        return new BankProjectManager();
    }
}
