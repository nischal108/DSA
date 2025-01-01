//the code changes based on whether the array starts from 0 or 1 also from any other number but needs to be consecutive
public class cyclicsort2{
    public static void main (String[] args){
        int [] arr = {2,3,6,5,4,1,7,0};
        CyclicSort(arr);
        for(int num : arr){
            System.out.println(num + ", ");
        }
    }
    static void CyclicSort(int [] arr){
        int i =0;
        while(i<arr.length-1){
            if(arr[i]==i){
                i++;
            }else{
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i]= temp;
            }
        }
    }
}