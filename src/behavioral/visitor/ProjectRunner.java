package behavioral.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        project.beWritten(juniorDeveloper);

        SeniorDeveloper seior = new SeniorDeveloper();
        project.beWritten(seior);

    }
}
