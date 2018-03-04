package creational.abstractFactory.website;

import creational.abstractFactory.ManageProject;

public class ProjectManager implements ManageProject {
    @Override
    public void manageProject() {
        System.out.println("Website PM manage website project");
    }
}
