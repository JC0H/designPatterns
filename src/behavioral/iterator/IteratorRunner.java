package behavioral.iterator;

public class IteratorRunner {
    public static void main(String[] args) {
        String skills[] = {"Maven", "Java","Git"};

        JavaDeveloper junior = new JavaDeveloper("Vasyl", skills);

        Iterator iterator = junior.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
