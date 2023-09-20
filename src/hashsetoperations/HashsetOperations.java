package hashsetoperations;

import java.util.HashSet;
import java.util.Set;

public class HashsetOperations {
    public static void main(String[] args) {
        // Create two HashSet objects
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to the first set
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Add elements to the second set
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Union: Combine elements from both sets
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // Intersection: Find common elements between sets
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // Difference (Set1 - Set2): Elements in Set1 but not in Set2
        Set<Integer> difference1 = new HashSet<>(set1);
        difference1.removeAll(set2);
        System.out.println("Difference (Set1 - Set2): " + difference1);

        // Difference (Set2 - Set1): Elements in Set2 but not in Set1
        Set<Integer> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("Difference (Set2 - Set1): " + difference2);
    }
}
