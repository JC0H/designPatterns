package structural.decorator;

public class JavaTeamLead extends DeveloperDecorator {


    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + madeCode();
    }

    private String madeCode() {
        return "make code review ";
    }
}
