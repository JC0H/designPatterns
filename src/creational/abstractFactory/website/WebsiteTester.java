package creational.abstractFactory.website;

import creational.abstractFactory.QATester;

public class WebsiteTester implements QATester {
    @Override
    public void writeQATest() {
        System.out.println("QA tester tests website code");
    }
}
