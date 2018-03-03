package behavioral.template;

public class WebsiteTempRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcome = new WelcomWeb();
        WebsiteTemplate text = new TextWeb();

        welcome.showPage();

        text.showPage();
    }
}
