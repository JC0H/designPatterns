package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DevelopersFactory {
    public static final Map<String, Developer> DEVELOPER_MAP = new HashMap<>();

    public Developer getDeveloper(String key){
        Developer developer = DEVELOPER_MAP.get(key);

        if (developer == null){
            switch (key){
                case "java":
                    System.out.println("Hiring Java Developer");
                    developer = new JavaDevloper();
                    break;
                case "c++":
                    System.out.println("Hiring C++ Developer");
                    developer = new CppDeveloper();
                    break;
            }
            DEVELOPER_MAP.put(key,developer);
        }
        return developer;
    }
}
