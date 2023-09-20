package collectionmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reversing {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Shawn");
        names.add("Bob");
        names.add("Charlie");

        //Reverse the order of elements in the list
        Collections.reverse(names);
        System.out.println("Reversed List: " + names);
    }
}
