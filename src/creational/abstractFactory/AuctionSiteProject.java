package creational.abstractFactory;

import creational.abstractFactory.banking.BankingProject;
import creational.abstractFactory.website.WebsiteProject;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectFactory projectFactory = new WebsiteProject();
        Developer developer = projectFactory.getDeveloper();
        QATester tester = projectFactory.getQATestter();
        ManageProject manager = projectFactory.getProjectManager();

        System.out.println("Creating website");
        developer.writeCode();
        tester.writeQATest();
        manager.manageProject();
    }
}
