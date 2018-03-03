package structural.composite;

public class Project {
    public static void main(String[] args) {
        Team team =  new Team();

        Developer javaDev = new JavaDeveloper();
        Developer cppDev = new CppDeveloper();

        team.addDev(javaDev);
        team.addDev(cppDev);

        team.createProject();
    }
}
