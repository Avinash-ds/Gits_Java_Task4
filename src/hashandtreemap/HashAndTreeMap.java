package hashandtreemap;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class HashAndTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        hashMap.put("John", 22);
        hashMap.put("Max", 24);
        hashMap.put("Rizz", 26);
        hashMap.put("Bob", 23);
        System.out.println("Hashmap: " + hashMap);

        treeMap.put("John", 22);
        treeMap.put("Max", 24);
        treeMap.put("Rizz", 26);
        treeMap.put("Bob", 23);
        System.out.println("TreeMap: " + treeMap);
    }

}
