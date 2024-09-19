package LabExperiments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// TestIO.java
public class TestIO {
    public static void main(String[] args) {
        // Create BufferedReader to read from console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // FileWriter and BufferedWriter for file output
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            // Create FileWriter with append mode (false for overwrite)
            fw = new FileWriter("output.txt", false);
            bw = new BufferedWriter(fw);

            // Prompt user for input
            System.out.print("Enter text to write to file (type 'exit' to finish):\n");

            String input;
            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                // Write input to file
                bw.write(input);
                bw.newLine(); // Add newline after each input line
            }

            System.out.println("Data written to file successfully.");

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        } finally {
            // Close resources in finally block
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}

