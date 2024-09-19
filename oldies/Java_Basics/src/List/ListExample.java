package list;

import java.util.ArrayList; // Import the ArrayList class from java.util
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Creating an empty list
        List<String> list = new ArrayList<>();

        // Adding elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Traversing through the list using for-each loop
        System.out.println("Elements in the list:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Traversing through the list using traditional for loop
        System.out.println("Elements in the list (using traditional for loop):");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Demonstrating other List methods
        System.out.println("The first element in the list is: " + list.get(0));
        System.out.println("The list contains 'Banana': " + list.contains("Banana"));
        System.out.println("The index of 'Cherry' in the list is: " + list.indexOf("Cherry"));

        // Removing an element from the list
        list.remove("Date");
        System.out.println("Elements in the list after removing 'Date': " + list);
    }
}
