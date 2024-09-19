import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArrayList{
    public static void main(String[] args) {
        // Create a 2D ArrayList
        ArrayList<ArrayList<Integer>> arraylist= new ArrayList<>();
        
        // Asking user for matrix size
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows: ");
        int row = sc.nextInt();
        System.out.println("Columns: ");
        int cols = sc.nextInt();
        
        // Loop to add rows
        for(int i = 0; i < row; i++){
            // Create a new ArrayList for each row
            ArrayList<Integer> innerList = new ArrayList<>();
            for(int j = 0; j < cols; j++){
                System.out.println("Enter element for position (" + i + "," + j + "): ");
                innerList.add(sc.nextInt());
            }
            // Add the inner list (representing a row) to the outer list
            arraylist.add(innerList);
        }

        // Close the scanner
        sc.close();

        // Print the 2D ArrayList
        System.out.println("2D ArrayList: ");
        for(ArrayList<Integer> innerList : arraylist){
            System.out.println(innerList);
        }
    }
}
