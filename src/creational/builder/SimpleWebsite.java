package creational.builder;

public class SimpleWebsite extends  WebSiteBuilder {
    @Override
    void buildName() {
        website.setName("Simple Website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
