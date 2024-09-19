package jun30;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number upto which you want to find the even numbers");
        Scanner sc = new Scanner(System.in);
        int maxThreshold = sc.nextInt();
        for (int i = 0; i < maxThreshold; i++) {
            if(i % 2 == 0) {
                System.out.println(i + "\t");
            }
        }
        sc.close();
    }
}
