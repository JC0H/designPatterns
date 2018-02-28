package structural.bridge;

public abstract class Program {

    Developer developer;

    public Program(Developer deve){
        this.developer = deve;
    }

    protected abstract void writeProgram();
}
