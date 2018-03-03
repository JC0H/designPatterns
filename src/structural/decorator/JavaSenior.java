package structural.decorator;

public class JavaSenior extends DeveloperDecorator {


    public JavaSenior(Developer developer) {
        super(developer);
    }

    public String makeCode(){
        return "Senior code review";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCode();
    }
}
