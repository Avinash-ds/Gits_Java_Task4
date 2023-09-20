package arraylistoperations;

import java.util.ArrayList;
import java.util.Iterator;

public class AnimalList {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> list = new ArrayList<String>();

        // Add some animals to the list
        list.add("cat");
        list.add("Dog");
        list.add("Rabbit");
        list.add("Sheep");

        // Display the list using enhanced for loop
        System.out.println("The animal list contains:");
        for (String s : list) {
            System.out.println(s);
        }

        // Remove the second animal from the list
        list.remove(1);

        // Display the list again using Iterator
        System.out.println("The list after removing the second element:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Update the first element
        list.set(0, "Tiger");

        // Display the list one more time using enhanced for loop
        System.out.println("The list after updating the first element:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
