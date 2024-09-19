import java.util.Scanner;

class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of input");
        String line = sc.nextLine();
        System.out.println(line);

        sc.close();
    }
}