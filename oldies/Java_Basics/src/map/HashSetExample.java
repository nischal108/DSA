package map;

import java.util.HashSet; // Import the HashSet class from java.util
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating an empty HashSet
        Set<String> hs = new HashSet<>();

        // Adding elements to the HashSet
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
        hs.add("Date");
        hs.add("Apple"); // Duplicate element, will not be added

        // Traversing through the HashSet using for-each loop
        System.out.println("Elements in the HashSet:");
        for (String fruit : hs) {
            System.out.println(fruit);
        }

        // Demonstrating other HashSet methods
        System.out.println("The HashSet contains 'Banana': " + hs.contains("Banana"));
        System.out.println("The HashSet contains 'Fig': " + hs.contains("Fig"));

        // Removing an element from the HashSet
        hs.remove("Date");
        System.out.println("Elements in the HashSet after removing 'Date': " + hs);

        // Checking the size of the HashSet
        System.out.println("The size of the HashSet: " + hs.size());
    }
}

