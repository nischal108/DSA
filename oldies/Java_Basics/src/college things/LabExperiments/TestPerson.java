package LabExperiments;

// Person.java
class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Private constructor
    private Person(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// TestPerson.java
public class TestPerson {
    public static void main(String[] args) {
        // Using default constructor
        Person p1 = new Person();
        System.out.println("Person 1: " + p1.getName() + ", Age: " + p1.getAge());

        // Using parameterized constructor
        Person p2 = new Person("Alice", 30);
        System.out.println("Person 2: " + p2.getName() + ", Age: " + p2.getAge());

        // Private constructor cannot be used here as it is not accessible
        // Person p3 = new Person("Bob"); // This line Swould cause a compilation error
    }
}
