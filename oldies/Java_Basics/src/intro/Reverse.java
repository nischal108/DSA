public class Reverse {
    public static void main(String[] args) {
        int num = 839534853;
        int answer = 0;
        while(num>0){
            int rem = num %10;
            answer = answer * 10  + rem;
            num = num /10; 
        }
        System.out.println(answer);
    }
}
