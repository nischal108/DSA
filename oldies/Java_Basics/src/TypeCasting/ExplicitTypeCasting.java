package TypeCasting;


//converting a larger datatype to a smaller data type
//double -> float -> long -> int -> char -> short -> byte
//This type of type casting is called narrowing type casting

public class ExplicitTypeCasting {
    public static void main(String[] args) {
        double e = 5.9098;
        int a = (int) e;
        char b = 'h' ;
        int d = (int) b;
        System.out.println("integer a :" + a);
        System.out.println("integer from character : " + d);
    }
}
