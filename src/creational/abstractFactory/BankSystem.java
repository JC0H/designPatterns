package creational.abstractFactory;

import creational.abstractFactory.banking.BankingProject;

public class BankSystem {
    public static void main(String[] args) {
        ProjectFactory projectFactory = new BankingProject();
        Developer developer = projectFactory.getDeveloper();
        QATester tester = projectFactory.getQATestter();
        ManageProject manager = projectFactory.getProjectManager();

        System.out.println("Creating bank system");
        developer.writeCode();
        tester.writeQATest();
        manager.manageProject();
    }
}
