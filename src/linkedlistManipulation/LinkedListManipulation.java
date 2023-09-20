package linkedlistManipulation;

import java.util.LinkedList;

public class LinkedListManipulation {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements at the end
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Print the original list
        System.out.println("Original List: " + linkedList);

        // Add an element at the beginning
        linkedList.addFirst(5);

        // Add an element at the end
        linkedList.addLast(40);

        // Print the updated list
        System.out.println("List after adding elements: " + linkedList);

        // Remove an element from the beginning
        linkedList.removeFirst();

        // Remove an element from the end
        linkedList.removeLast();

        // Print the list after removal
        System.out.println("List after removing elements: " + linkedList);

        // Reverse the list
        LinkedList<Integer> reversedList = reverseLinkedList(linkedList);

        // Print the reversed list
        System.out.println("Reversed List: " + reversedList);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversed = new LinkedList<>();
        for (Integer element : list) {
            reversed.addFirst(element);
        }
        return reversed;
    }
}
