package collectionmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        // Sort the list in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);
    }
}
