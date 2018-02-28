package structural.bridge;

public class BankSystem extends Program {

    public BankSystem(Developer deve) {
        super(deve);
    }

    @Override
    protected void writeProgram() {
        System.out.println("Create Bank system");
        developer.writeCode();
    }
}
