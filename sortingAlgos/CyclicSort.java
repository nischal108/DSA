public class CyclicSort{
    public static void main(String[] args){
        int [] arr = {3, 5, 2, 1, 4};
        cyclicSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println('\n');
    }
    static void cyclicSort(int [] arr){
        int i =0; 
        while(i<arr.length-1){
            if(arr[i]!= i+1){
                int correctPlace = arr[i]-1;
                swap(i,correctPlace, arr);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int i , int j, int [] arr){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
}