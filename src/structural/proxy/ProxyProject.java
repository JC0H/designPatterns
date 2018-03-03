package structural.proxy;

public class ProxyProject implements Project{
    RealProject realProject;
    private String url;

    public ProxyProject(String url) {
        this.url = url;
    }

    public void run(){
        if (realProject == null)
            realProject = new RealProject(url);
        realProject.run();
    }
}
