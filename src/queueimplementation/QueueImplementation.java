package queueimplementation;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        // Create a queue using ArrayDeque
        Queue<String> queue = new ArrayDeque<>();

        // Enqueue (add) elements to the queue
        queue.add("Alice");
        queue.add("Bale");
        queue.add("Cameron");

        // Dequeue (remove) from the queue
        while (!queue.isEmpty()) {
            String element = queue.remove();
            System.out.println("Dequeued: " + element);
        }
    }
}
