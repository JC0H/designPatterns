package creational.builder;

public class Website {
    private String name;
    private Cms cms;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    public void setPrice(int prive) {
        this.price = prive;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cms=" + cms +
                ", prive=" + price +
                '}';
    }
}
