package mapiteration;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
    public static void main(String[] args) {
        // Create a HashMap with key-value pairs
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 88);
        scores.put("Charlie", 75);

        // Method 1: Using an enhanced for loop to iterate through keys and values
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Method 2: Using keySet() to iterate through keys and get values
        for (String key : scores.keySet()) {
            int value = scores.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
