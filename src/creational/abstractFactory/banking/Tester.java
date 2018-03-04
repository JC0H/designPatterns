package creational.abstractFactory.banking;

import creational.abstractFactory.QATester;

public class Tester implements QATester {
    @Override
    public void writeQATest() {
        System.out.println("Tester writes ");
    }
}
