package stackusinglinkedlist;

import java.util.LinkedList;

public class StackUsingLinkedList<E> {
    private LinkedList<E> list = new LinkedList<>();

    // Push operation to add an element to the stack
    public void push(E element) {
        list.addFirst(element);
    }

    // Pop operation to remove and return the top element from the stack
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        return list.removeFirst();
    }

    // Peek operation to return the top element without removing it
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return list.getFirst();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop and print elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Peek and print the top element
        System.out.println("Top element: " + stack.peek());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Get the size of the stack
        System.out.println("Stack size: " + stack.size());
    }
}
