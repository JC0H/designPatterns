package structural.proxy;

public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    private void load() {
        System.out.println("Loading project ... Please wait few minutes");

    }

    @Override
    public void run() {
        System.out.println("Run project from github : " + url);
    }
}
