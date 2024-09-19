import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter the number : ");
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        int count = 2;
        while(count<n){
            int temp = b;
            b = a+b;
            a = temp;
            count++;
        }
        System.out.println(b);

        sc.close();
    }
}

// 0 1 1 2 3 5 8 
