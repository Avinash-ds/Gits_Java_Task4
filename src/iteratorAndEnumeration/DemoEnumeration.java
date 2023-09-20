package iteratorAndEnumeration;

import java.util.Enumeration;
import java.util.Vector;

public class DemoEnumeration {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Using Enumeration to traverse through the legacy collection (Vector)
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            String element = enumeration.nextElement();
            System.out.println(element);
        }
    }
}
