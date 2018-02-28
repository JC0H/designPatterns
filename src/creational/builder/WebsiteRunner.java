package creational.builder;

public class WebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new EnterpriseWebsite());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
