package map;

import java.util.HashMap; // Import the HashMap class from java.util
import java.util.Map;

public class HashMapExample { // Class name must match the file name
    public static void main(String[] args) {
        // Creating an empty hash map
        Map<String, Integer> hm = new HashMap<>();

        // Inserting pairs in the map
        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);

        // Traversing through the map using for-each loop
        System.out.println("Keys and values in the map:");
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            // Printing keys and values
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Printing keys only
        System.out.println("Keys in the map:");
        for (String key : hm.keySet()) {
            System.out.println(key);
        }

        // Printing values only
        System.out.println("Values in the map:");
        for (Integer value : hm.values()) {
            System.out.println(value);
        }
    }
}

