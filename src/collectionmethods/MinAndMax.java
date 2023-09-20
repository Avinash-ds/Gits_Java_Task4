package collectionmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinAndMax {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        // Find the maximum and minimum elements in the list
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);
    }
}
