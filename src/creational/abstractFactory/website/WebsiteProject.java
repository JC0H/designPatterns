package creational.abstractFactory.website;

import creational.abstractFactory.Developer;
import creational.abstractFactory.ManageProject;
import creational.abstractFactory.ProjectFactory;
import creational.abstractFactory.QATester;

public class WebsiteProject implements ProjectFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public QATester getQATestter() {
        return new WebsiteTester();
    }

    @Override
    public ManageProject getProjectManager() {
        return new ProjectManager();
    }
}
