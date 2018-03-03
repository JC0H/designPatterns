package structural.proxy;

public class ProxyRunner {
    public static void main(String[] args) {
        Project github = new ProxyProject("http://github.com/jcoh/dp");

        github.run();
    }
}
