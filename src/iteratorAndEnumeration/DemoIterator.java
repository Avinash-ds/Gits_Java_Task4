package iteratorAndEnumeration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Alice");
        strings.add("Bob");
        strings.add("Charlie");

        // Using Iterator to traverse through the collection
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
