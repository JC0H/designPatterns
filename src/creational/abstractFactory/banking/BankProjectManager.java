package creational.abstractFactory.banking;

import creational.abstractFactory.ManageProject;

public class BankProjectManager implements ManageProject {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project");
    }
}
