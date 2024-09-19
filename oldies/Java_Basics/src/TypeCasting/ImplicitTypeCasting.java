package TypeCasting;

//Type of typecasting that happens on its own because of the JVM.
//this form of typecasting is also called implicit typecasting or widening typecasting
//byte -> short -> char -> int -> long -> float -> double


public class ImplicitTypeCasting {
    public static void main(String[] args){
        int a = 80;
        double d = a;
        long e = a;
        System.out.println("d:"+d);
        System.out.println("e:"+e);
    }
}
