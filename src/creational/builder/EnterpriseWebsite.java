package creational.builder;

public class EnterpriseWebsite extends WebSiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise Website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
