package creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project main = new Project(1,"First Version", " SOurce source = new Source();");

        System.out.println(main);

        Project mainClone = (Project)main.copy();
        System.out.println(mainClone);
    }
}
