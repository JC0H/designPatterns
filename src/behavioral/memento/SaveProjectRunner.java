package behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GithubRepo git = new GithubRepo();

        System.out.println("Creating new project version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);
        System.out.println("Saving current version to github");
        git.setSave(project.save());

        System.out.println("Adding new code");
        project.setVersionAndDate("Version 1.1");
        System.out.println(project);

        System.out.println("Something going wrong, reload previous code");
        project.load(git.getSave());

        System.out.println(project);
    }
}
