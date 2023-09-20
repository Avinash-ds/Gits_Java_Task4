package hashandtreeset;

import java.util.HashSet;
import java.util.TreeSet;

public class HashAndTreeSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        TreeSet<String> treeSet = new TreeSet<String>();

        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(4);

        treeSet.add("d");
        treeSet.add("e");
        treeSet.add("b");
        treeSet.add("a");
        treeSet.add("c");

        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);

        System.out.println("Treeset order : Ascending order");
        for (String Tset : treeSet) {
            System.out.println(Tset);
        }
        System.out.println("HashSet order : Not predictable");
        for (int Hset : hashSet) {
            System.out.println(Hset);
        }
    }
}
