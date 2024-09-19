package LabExperiments;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Example 1: Division by zero (ArithmeticException)
        try {
            int result = 10 / 0; // Division by zero
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero");
        } finally {
            System.out.println("Finally block executed after handling ArithmeticException");
        }

        // Example 2: Array index out of bounds (ArrayIndexOutOfBoundsException)
        try {
            int[] array = new int[3];
            int value = array[5]; // Accessing index out of bounds
            System.out.println("Value at index 5: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index out of bounds");
        } finally {
            System.out.println("Finally block executed after handling ArrayIndexOutOfBoundsException");
        }
    }
}
