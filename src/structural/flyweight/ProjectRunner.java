package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DevelopersFactory developersFactory = new DevelopersFactory();

        List<Developer> developerList = new ArrayList<>();
        developerList.add(developersFactory.getDeveloper("java"));
        developerList.add(developersFactory.getDeveloper("java"));
        developerList.add(developersFactory.getDeveloper("java"));
        developerList.add(developersFactory.getDeveloper("java"));
        developerList.add(developersFactory.getDeveloper("c++"));
        developerList.add(developersFactory.getDeveloper("c++"));
        developerList.add(developersFactory.getDeveloper("c++"));
        developerList.add(developersFactory.getDeveloper("c++"));

        for (Developer developer: developerList){
            developer.writeCode();
        }

    }

}
