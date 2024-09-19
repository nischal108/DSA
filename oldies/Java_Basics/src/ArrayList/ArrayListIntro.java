
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {
    public static void main(String[] agrs) {
        ArrayList<Integer> firstList = new ArrayList<>(3);
        Scanner sc = new Scanner(System.in);
        for (int i =0; i<10;i++){
            firstList.add(sc.nextInt());
        }

        System.out.println(firstList);
        sc.close();

        firstList.set(0,4);
        System.out.println(firstList);
        

        firstList.remove(6);
        System.out.println(firstList);

        firstList.add(4,5);
        System.out.println(firstList);

        System.out.println(firstList.size());

        System.out.println(firstList.get(4));
    }
}