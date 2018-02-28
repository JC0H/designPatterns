package structural.bridge;

public class StockExchange extends Program {

    public StockExchange(Developer deve) {
        super(deve);
    }

    @Override
    protected void writeProgram() {
        System.out.println("Create Stock system");
        developer.writeCode();
    }
}
