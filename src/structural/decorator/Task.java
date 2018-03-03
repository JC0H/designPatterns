package structural.decorator;

public class Task {
    public static void main(String[] args) {
        Developer dev = new JavaDeveloper();

        System.out.println(dev.makeJob());
    }
}
