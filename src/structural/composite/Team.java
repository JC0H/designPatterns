package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    List<Developer> developers = new ArrayList<>();

    public void addDev(Developer developer){
        developers.add(developer);
    }

    public void removeDev(Developer developer){
        developers.remove(developer);
    }

    public void createProject(){
        for (Developer dev : developers){
            dev.writeCode();
        }
    }
}
