public class AmstrongNumber {
    public static void main(String[] args) {
        int num = 153;

        
        if (isItArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

   
    static boolean isItArmstrong(int n) {
        int original = n;  
        int sum = 0;       

        
        while (n > 0) {
            int rem = n % 10;   
            sum += rem * rem * rem; 
            n = n / 10;          
        }
        return sum == original;
    }
}
