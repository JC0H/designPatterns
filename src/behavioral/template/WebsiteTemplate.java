package behavioral.template;

public abstract class WebsiteTemplate {
    public void showPage(){
        System.out.println("Header");
        showPageContent();
        System.out.println("View page");
    }

    public abstract void showPageContent();
}
