package LabExperiments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// StudentList.java
public class StudentList {
    private ArrayList<String> studentNames;
    private Scanner scanner;

    // Constructor
    public StudentList() {
        this.studentNames = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    // Method to add a student name to the list
    public void addStudent(String name) {
        studentNames.add(name);
    }

    // Method to remove a student name from the list
    public void removeStudent(String name) {
        studentNames.remove(name);
    }

    // Method to print all student names using Iterator
    public void printStudentsUsingIterator() {
        Iterator<String> iterator = studentNames.iterator();
        System.out.println("Student names (using Iterator):");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Method to print all student names using enhanced for loop
    public void printStudentsUsingEnhancedForLoop() {
        System.out.println("Student names (using Enhanced For Loop):");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }

    // Method to get user input
    public String getUserInput(String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextLine();
    }

    // Main method for testing
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter student names until they want to stop
        String userInput;
        do {
            String studentName = studentList.getUserInput("Enter a student name (or type 'exit' to finish):");
            if (!studentName.equalsIgnoreCase("exit")) {
                studentList.addStudent(studentName);
            }
            System.out.print("Do you want to add another student? (yes/no): ");
            userInput = scanner.nextLine();
        } while (userInput.equalsIgnoreCase("yes"));

        // Printing students using Iterator
        studentList.printStudentsUsingIterator();

        // Removing a student (if desired)
        String removeStudent = studentList.getUserInput("Enter a student name to remove (or type 'skip' to continue):");
        if (!removeStudent.equalsIgnoreCase("skip")) {
            studentList.removeStudent(removeStudent);
            studentList.printStudentsUsingEnhancedForLoop();
        }

        // Close scanner
        scanner.close();
    }
}
