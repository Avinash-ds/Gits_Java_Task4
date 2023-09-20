package duplicateremover;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateRemover {
    public static void main(String[] args) {
        // Create an ArrayList with duplicate elements
        List<String> originalList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("banana");
        originalList.add("apple");
        originalList.add("cherry");
        originalList.add("banana");

        // Remove duplicates while preserving the order
        List<String> uniqueList = removeDuplicates(originalList);

        // Print the unique elements
        System.out.println("Unique Elements:");
        for (String element : uniqueList) {
            System.out.println(element);
        }
    }

    public static <T> List<T> removeDuplicates(List<T> list) {
        // Create a HashSet to keep track of encountered elements
        HashSet<T> set = new HashSet<>();

        // Create a new ArrayList to store unique elements in order
        List<T> uniqueList = new ArrayList<>();

        // Iterate through the original list
        for (T element : list) {
            // If the element hasn't been encountered before, add it to the unique list
            if (set.add(element)) {
                uniqueList.add(element);
            }
        }

        return uniqueList;
    }
}
